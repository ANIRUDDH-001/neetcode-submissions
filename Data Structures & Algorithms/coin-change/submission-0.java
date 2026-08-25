class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[] = new int[amount + 1];
        for (int j = 1; j <= amount; j++) {
            dp[j] = amount + 1; 
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                int take = amount+1;
                if (j >= coins[i - 1])
                    take = dp[j - coins[i - 1]] + 1;
                int skip = dp[j] = dp[j];
                dp[j] = Math.min(take, skip);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
