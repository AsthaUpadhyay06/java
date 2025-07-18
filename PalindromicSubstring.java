 public class PalindromicSubstring {
    public static void main(String[] args) {
        String str = "babad";
        int n = str.length();
        boolean[][] dp = new boolean[n][n];
        String longest = "";

        for (int l = 1; l <= n; l++) {
            for (int i = 0; i <= n - l; i++) {
                int j = i + l - 1;
                if (str.charAt(i) == str.charAt(j) && (l < 3 || dp[i+1][j-1])) {
                    dp[i][j] = true;
                    if (l > longest.length())
                        longest = str.substring(i, j+1);
                }
            }
        }

        System.out.println("Longest Palindromic Substring: " + longest);
    }
} efgrfgf
