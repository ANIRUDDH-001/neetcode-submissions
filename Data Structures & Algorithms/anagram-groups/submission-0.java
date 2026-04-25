class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map= new HashMap<>();
        for(String s: strs){
            char[] curr= s.toCharArray();
            Arrays.sort(curr);
            String sorted= new String(curr);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }
}



