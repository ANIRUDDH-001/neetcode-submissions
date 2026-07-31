class Solution {
    public boolean isSubsequence(String s, String t) {
        int left=0, right=0;
        int n=s.length();
        int m=t.length();
        while(left<n && right< m){
            if(s.charAt(left)==t.charAt(right))left++;
            right++;
        }
        return left==n;
    }
}