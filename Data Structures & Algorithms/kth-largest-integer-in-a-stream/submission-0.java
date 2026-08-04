class KthLargest {
    PriorityQueue<Integer> pq;
    int K;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        K = k;
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > K)
                pq.poll();
        }
    }

    public int add(int val) {
        pq.add(val);
        if (pq.size() > K) {
            pq.poll();
        }
        return pq.peek();
    }
}
