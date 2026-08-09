class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]- b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                int arr[] = new int[2];
                arr[0] = start;
                arr[1] = end;
                list.add(arr);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        int arr[] = new int[2];
        arr[0] = start;
        arr[1] = end;
        list.add(arr);
        int res[][] = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }
        return res;
    }
}
