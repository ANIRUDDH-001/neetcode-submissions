class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        List<Integer> list = new ArrayList<>();
        while(left<=right && top<=bottom){
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            if(top<=bottom){
                for(int i=top; i<=bottom; i++){
                    list.add(matrix[i][right]);
                }
                right--;
            }
            if(right>=left && bottom >=top){
                for(int i=right; i>=left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(right>=left && bottom >=top){
                for(int i=bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
