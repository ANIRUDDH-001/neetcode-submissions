class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int p[] : dp) {
            Arrays.fill(p, -1);
        }
        return helper(text1, text2, n, m, dp);
    }
    public int helper(String s, String t, int n, int m, int dp[][]) {
        if (n == 0 || m == 0)
            return 0;
        if (dp[n][m] != -1)
            return dp[n][m];
        if (s.charAt(n - 1) == t.charAt(m - 1)) {
            return dp[n][m] = helper(s, t, n - 1, m - 1, dp) + 1;
        } else {
            return dp[n][m] = Math.max(helper(s, t, n, m - 1, dp), helper(s, t, n - 1, m, dp));
        }
    }
}
