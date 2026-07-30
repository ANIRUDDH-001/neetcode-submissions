class Solution {
    public List<String> stringMatching(String[] words) {
        int n=words.length;
        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j) continue;
                if(issub(words[i], words[j])) if(!list.contains(words[i]))list.add(words[i]);
            }
        }
        return list;
    }

    public boolean issub(String s, String t){
        if(s.length()>t.length()) return false;
        int n=s.length();
        for(int i=0; i<t.length()-n+1; i++){
            if(t.substring(i, i+n).equals(s)) return true;       
        }
        return false;
    }
}