class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top=0;
        int bottom=matrix.length-1;
        int row=0;
        while(top<=bottom){
            int cen=top+(bottom-top)/2;
            if(matrix[cen][0]>target) bottom=cen-1;
            else {
                row=cen;
                top=cen+1;
            }
        }

        int left=0;
        int right=matrix[0].length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(matrix[row][mid]==target) return true;
            else if(matrix[row][mid]>target) right=mid-1;
            else left=mid+1;
        }
        return false;
    }
}
