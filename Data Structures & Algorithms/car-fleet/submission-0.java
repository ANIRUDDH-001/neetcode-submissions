class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int arr[][] = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0]=position[i];
            arr[i][1]=speed[i];
        }
        Arrays.sort(arr, (a,b) -> b[0]-a[0]);
        Stack<Double> st = new Stack<>();
        for(int i=0; i<n; i++){
            double time= (double)(target - arr[i][0])/arr[i][1];
            if(!st.isEmpty() && time <= st.peek()){
                continue;
            }
            st.push(time);
        }
        return st.size();
    }
}