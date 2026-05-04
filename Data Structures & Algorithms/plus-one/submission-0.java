class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        int n=digits.length;
        for(int i=n-1; i>=0; i--){
            int num= digits[i]+carry;
            carry=(num/10)%10;
            if(num>=10) num=num%10;
            digits[i]=num;
            if(carry==0) return digits;
        }

        if(carry==1){
            int arr[]= new int[n+1];
            arr[0]=1;
            for(int i=0; i<n; i++){
                arr[i+1]=digits[i];
            }
            return arr;
        }
        return digits;
    }
}
