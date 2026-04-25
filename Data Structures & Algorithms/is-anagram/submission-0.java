class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[]= new int[26];
        Arrays.fill(freq,0);
        for(char c: s.toCharArray()){
            freq[c-'a']+=1;
        }
        for(char c: t.toCharArray()){
            if (freq[c-'a']>0) freq[c-'a']-=1; else return false;
        }
        for(int num: freq){
            if(num!=0) return false;
        }
        return true;
        
    }
}
