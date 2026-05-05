class Solution {
    public int maxProfit(int[] prices) {
        int bp=Integer.MAX_VALUE;
        int max=0;
        for(int num: prices){
            if(num>bp){
                int profit=num-bp;
                max=Math.max(max,profit);
            }else{
                bp=num;
            }
        }
        return max;
    }
}
