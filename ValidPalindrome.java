public class ValidPalindrome {
    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Try removing either left or right character and check if palindrome
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true; // If no mismatches, it's already a palindrome
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("abca")); // Output: true (remove 'c')
        System.out.println(validPalindrome("racecar")); // Output: true (already palindrome)
        System.out.println(validPalindrome("hello")); // Output: false
    }
} 