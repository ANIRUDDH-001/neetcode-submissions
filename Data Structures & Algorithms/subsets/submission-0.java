class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> mainlist =new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        genSubsets(nums,0,mainlist,list);
        return mainlist;
    }

    public void genSubsets(int nums[], int curr, List<List<Integer>> mainlist,List<Integer> list){
        if(nums.length==curr){
            mainlist.add(new ArrayList<>(list));
            return;
        } 
        list.add(nums[curr]);
        genSubsets(nums,curr+1,mainlist,list);
        list.remove(list.size()-1);
        genSubsets(nums,curr+1,mainlist,list);
    }
}
