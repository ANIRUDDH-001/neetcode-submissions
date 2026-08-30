class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if (h < piles.length)
            return -1;
        int max = 0;
        for (int num : piles) {
            max = Math.max(num, max);
        }
        int low = 1, high = max;
        return helper(piles, low, high, h);
    }
    public int helper(int piles[], int low, int high, int h) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (solve(piles, mid) > h) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return high;
    }

    public int solve(int piles[], int mid) {
        int count = 0;
        for (int i = 0; i < piles.length; i++) {
            int div = piles[i] / mid;
            count += (piles[i] % mid == 0 ? div : div + 1);
        }
        return count;
    }
}
