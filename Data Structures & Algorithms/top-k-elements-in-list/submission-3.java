class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> heap= new PriorityQueue<>((a,b)-> a[0]-b[0]);
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            heap.add(new int[]{entry.getValue(), entry.getKey()});
            if(heap.size()>k) heap.poll();
        }
        int res[]= new int[k];
        for(int i=0; i<k; i++){
            res[i]=heap.poll()[1];
        }
        return res;
    }

}
