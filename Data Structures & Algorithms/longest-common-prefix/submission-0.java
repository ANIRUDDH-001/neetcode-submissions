class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String pre=strs[0];
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<n; i++){
            int m=strs[i].length();
            int len =pre.length();
            int j=0;
            while(j<len && j<m && strs[i].charAt(j)==pre.charAt(j)){
                j++;                
            }
            pre=strs[i].substring(0,j);
        }
        sb.append(pre);
        return sb.toString();
    }
}