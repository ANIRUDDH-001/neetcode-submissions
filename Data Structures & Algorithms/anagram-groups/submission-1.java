class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String s: strs){

            char Str[]= s.toCharArray();
            Arrays.sort(Str);
            String temp= new String(Str);

            if(!map.containsKey(temp)){
                map.put(temp, new ArrayList<>());
            }
            map.get(temp).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
