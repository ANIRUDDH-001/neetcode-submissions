class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n + 1];
        int dp1[] = new int[n + 1]; 
        if(n==1) return nums[0];
        Arrays.fill(dp,-1);
        Arrays.fill(dp1,-1);      
        return Math.max(robb(nums, 0, n - 1, dp), robb(nums, 1, n, dp1));
    }
    public int robb(int nums[], int idx, int end, int dp[]) {
        if (idx >= end)
            return 0;
        if (dp[idx] != -1)
            return dp[idx];
        return dp[idx] =
                   Math.max(robb(nums, idx + 1, end, dp), robb(nums, idx + 2, end, dp) + nums[idx]);
    }
}
