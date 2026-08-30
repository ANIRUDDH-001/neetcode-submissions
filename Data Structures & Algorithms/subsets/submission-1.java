class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> mainlist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(nums, list, mainlist, 0);
        return mainlist;
    }
    public void helper(int[] nums, List<Integer> list, List<List<Integer>> mainlist, int curr) {
        if (curr == nums.length) {
            mainlist.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[curr]);
        helper(nums, list, mainlist, curr + 1);
        list.remove(list.size() - 1);
        helper(nums, list, mainlist, curr + 1);
    }
}
