public class PalindromicSubstrings {
    public static void main(String[] args) {
        String s = "aaa";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (new StringBuilder(sub).reverse().toString().equals(sub))
                    count++;
            }
        }

        System.out.println("Total palindromic substrings: " + count);
    }
}