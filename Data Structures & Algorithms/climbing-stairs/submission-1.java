class Solution {
    public int climbStairs(int n) {
        if (n <= 2)
            return n;
        int first=1;
        int sec=2;
        int third=0;
        for (int i = 2; i < n; i++) {
            third=first+sec;
            first=sec;
            sec=third;
        }
        return third;
    }
}
