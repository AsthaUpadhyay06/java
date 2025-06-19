
    public class LongestPalindrome1 {
    public static void main(String[] args) {
        String s = "babad";
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String result = "";

        for (int l = n - 1; l >= 0; l--) {
            for (int r = l; r < n; r++) {
                if (s.charAt(l) == s.charAt(r) && (r - l <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if (r - l + 1 > result.length()) {
                        result = s.substring(l, r + 1);
                    }
                }
            }
        }

        System.out.println("Longest Palindromic Substring: " + result);
    }
}

