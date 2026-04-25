class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int max=0;
        while(left<right){
            int curr= Math.min(heights[left],heights[right]) * (right-left);
            max = Math.max(curr,max);
            if(heights[right]>heights[left]) left++;
            else right--;
        }
        return max;
    }
}
