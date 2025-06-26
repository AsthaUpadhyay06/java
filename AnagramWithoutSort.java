public class AnagramWithoutSort {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        
        int[] count = new int[26];
        
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            count[c - 'a']--;
        }

        boolean isAnagram = true;
        for (int val : count) {
            if (val != 0) {
                isAnagram = false;
                break;
            }
        }

        System.out.println(isAnagram ? "Anagram" : "Not Anagram");
    }
} 