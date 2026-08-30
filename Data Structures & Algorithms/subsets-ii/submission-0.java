class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> mainlist=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, mainlist, list, 0);
        return mainlist;
    }
    public void helper(int[] nums, List<List<Integer>> mainlist, List<Integer>list, int curr){
        if(curr==nums.length){
            mainlist.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[curr]);
        helper(nums, mainlist, list, curr+1);
        list.remove(list.size()-1);
        while(curr+1<nums.length && nums[curr]==nums[curr+1]) curr++;
        helper(nums, mainlist, list, curr+1);
    }
}
