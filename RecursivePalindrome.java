 public class RecursivePalindrome {
    static boolean isPalindrome(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return isPalindrome(s, i + 1, j - 1);
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str, 0, str.length() - 1) ? "Palindrome" : "Not Palindrome");
    }
} 