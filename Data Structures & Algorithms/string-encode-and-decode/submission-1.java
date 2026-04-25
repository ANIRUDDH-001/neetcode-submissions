class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<strs.size(); i++){
            String temp=strs.get(i);
            sb.append(temp.length());
            sb.append("#");
            sb.append(temp);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int curr=0;
        int n=str.length();
        List<String> list= new ArrayList<>();
        while(curr<n){
            int cnt=0;
            while(str.charAt(curr)!='#' && curr<n){
                int num=str.charAt(curr)-'0';
                cnt=cnt*10+num;
                curr++;
            }
            if(curr>=n) return list;
            curr++;
            list.add(str.substring(curr,curr+cnt));
            curr=curr+cnt;
        }
        return list;
    }
}
