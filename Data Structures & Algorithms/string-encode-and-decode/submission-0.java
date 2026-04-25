class Solution {

    public String encode(List<String> strs) {
        StringBuilder s= new StringBuilder("");
        for(int i=0; i<strs.size(); i++){
            String temp= strs.get(i);
            int n=temp.length();
            s.append(n);
            s.append("#");  
            s.append(temp);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> list= new ArrayList<>();
        int i=0;
        int n=str.length();
        while(i<n){
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            list.add(str.substring(i, i + length));
            i += length;
        }
        return list;
    }
}