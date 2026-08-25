class Solution {
    public int lengthOfLIS(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int arr[] = new int[set.size()];
        int i = 0;
        for (int num : set) {
            arr[i++] = num;
        }
        int dp[][] = new int[nums.length + 1][arr.length + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        Arrays.sort(arr);
        return lis(nums, arr, nums.length, arr.length, dp);
    }
    public int lis(int nums[], int arr[], int n, int m, int dp[][]) {
        if (n == 0 || m == 0)
            return 0;
        if (dp[n][m] != -1)
            return dp[n][m];
        if (nums[n - 1] == arr[m - 1])
            return dp[n][m] = lis(nums, arr, n - 1, m - 1, dp) + 1;
        return dp[n][m] = Math.max(lis(nums, arr, n - 1, m, dp), lis(nums, arr, n, m - 1, dp));
    }
}
