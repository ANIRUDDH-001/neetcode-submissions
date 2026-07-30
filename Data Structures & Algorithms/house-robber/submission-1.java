class Solution {
    public int rob(int[] nums) {
        int first=0;
        int sec=0;
        for(int i=0; i<nums.length; i++){
            int temp=Math.max(nums[i]+ first, sec);
            first=sec;
            sec=temp;
        }
        return sec;

    }
}
