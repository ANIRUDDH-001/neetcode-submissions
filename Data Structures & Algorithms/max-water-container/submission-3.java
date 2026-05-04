class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int left=0;
        int right=n-1;
        int maxcap=0;
        while(left<right){
            int cap=Math.min(heights[left],heights[right])*(right-left);
            maxcap=Math.max(maxcap,cap);
            if(heights[right]>heights[left]) left++;
            else right--;

        }
        return maxcap;
    }
}
