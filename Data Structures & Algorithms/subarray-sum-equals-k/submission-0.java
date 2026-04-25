class Solution {
    public int subarraySum(int[] nums, int k) {
        int n= nums.length;
        int pre[]= new int[n];
        pre[0]=nums[0];
        for(int i=1; i<n; i++){
            pre[i]=pre[i-1]+nums[i];
        }
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum=pre[j]-(i > 0 ? pre[i-1] : 0);
                if(sum==k)count++;
            }
        }
        return count;
    }
}