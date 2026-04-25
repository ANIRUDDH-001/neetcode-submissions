class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);    
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());  

        Collections.sort(list, (e1,e2) -> e1.getValue().compareTo(e2.getValue()));

         int ans[] = new int[k];
         int idx=0;
         for(int j=list.size()-1; j>=0 && idx<k; j--){
            ans[idx++]=list.get(j).getKey();
        }    

        return ans;
    }
}
