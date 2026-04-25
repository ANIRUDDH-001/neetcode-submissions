class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        int n = list.size()-1;
        Collections.sort(list, (e1,e2) -> e1.getValue().compareTo(e2.getValue()));
        int count=0;
        int arr[]=new int[k];
        for(int i=n; i>=0 && count<k; i--){
            arr[count++]=list.get(i).getKey();
        }
        return arr;

    }
}


