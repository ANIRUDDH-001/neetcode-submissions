class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int max=0;
        for(int s: set){ 
            int count=1; 
            if(!set.contains(s-1)){                
                int temp=s;
                while(set.contains(temp+1)){
                    count++;
                    temp++;
                }
            }
            max=Math.max(count,max);
        }
        return max;

    }
}
