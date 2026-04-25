class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int freq[][]= new int[map.size()][2];
        int i=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            freq[i][0]= entry.getKey();
            freq[i][1]= entry.getValue();
            i++;
        }
        Arrays.sort(freq, (a,b) ->b[1]-a[1]);

        int ans[]= new int[k];
        for(int j=0; j<k; j++){
            ans[j]=freq[j][0];
        }
        return ans;

    }
}
