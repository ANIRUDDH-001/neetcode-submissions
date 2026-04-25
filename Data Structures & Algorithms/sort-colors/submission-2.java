class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int m=0;
        while(m<=r){
            if(nums[m]==0){
                swap(m,l,nums);
                l++;
                m++;
            }else if(nums[m]==2){
                swap(m,r,nums);
                r--;
            }else m++;
        }

    }

    public void swap(int i, int j, int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}