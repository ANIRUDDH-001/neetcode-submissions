class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=digitSq(n);
            
        }
        if(n==1) return true;
        return false;
    }

    public int digitSq(int n){
        int temp=n;
        int sum=0;
        while(temp!=0){
            sum+=(temp%10)*(temp%10);
            temp/=10;
        }
        return sum;
    }
}
