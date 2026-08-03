class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max=0;
        int i=0, j=0;
        int n=s.length();
        while(i<n){          
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                i++;
                max=Math.max(max, i-j);
            }else{
                while(j<i && set.contains(s.charAt(i))){
                    set.remove(s.charAt(j++));
                }
            }
        }
        return max;
    }
}
