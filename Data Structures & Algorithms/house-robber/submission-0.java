class Solution {
    public int rob(int[] nums) {
        int sum=0;
        int n=nums.length;
        int dp[]= new int[n+1];
        return robb(nums, 0,dp);
    }
    public int robb(int nums[], int idx, int dp[]){
        if(idx>=nums.length) return 0;
        if(dp[idx]!=0) return dp[idx];
        return dp[idx]=Math.max(robb(nums, idx+1, dp), robb(nums, idx+2, dp)+nums[idx]);
    }
}
