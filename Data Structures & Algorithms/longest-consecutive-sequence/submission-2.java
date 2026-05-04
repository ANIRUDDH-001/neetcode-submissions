class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int max=0;
        for(int num: nums){
            int curr=0;
            if(!set.contains(num-1)){
                curr++;
                int temp=num;
                while(set.contains(temp+1)){
                    curr++;
                    temp++;
                } 
            }
            max=Math.max(max,curr);
        }
        return max;
    }
}
