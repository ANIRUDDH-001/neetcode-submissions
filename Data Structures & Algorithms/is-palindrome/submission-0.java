class Solution {
    public boolean isPalindrome(String s) {
        int n =s.length();
        int left=0, right = n-1;
        while(left<right){
            Character ch = s.charAt(left);
            Character chr = s.charAt(right);
            if(!Character.isLetterOrDigit(ch)) left++;
            else if(!Character.isLetterOrDigit(chr)) right--;
            else if(Character.toLowerCase(ch)!=Character.toLowerCase(chr)) return false;
            else {
                left++;
                right--;
            }
        }
            return true;
    }
    
}
