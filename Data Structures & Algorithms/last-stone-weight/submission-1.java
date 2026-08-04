class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : stones) {
            pq.add(num);
        }
        while (pq.size() > 1) {
            int first = pq.poll();
            int sec = pq.poll();
            if (first == sec)
                continue;
            else
                pq.add(Math.abs(first - sec));
        }
        return pq.isEmpty()?0:pq.poll();
    }
}
