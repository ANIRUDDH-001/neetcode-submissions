class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int l=0, r=0;
        while(r<n){
            if(nums[r]!=val){
                nums[l]=nums[r];
                l++;
            }
            r++;
        }
        return l;

    }
}