class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> mainlist = new ArrayList<>();
        return helper(nums, target, list, mainlist, 0);
    }

    public List<List<Integer>> helper(
        int nums[], int target, List<Integer> list, List<List<Integer>> mainlist, int curr) {
        if (curr >= nums.length) {
            if (target == 0) {
                mainlist.add(new ArrayList<>(list));
            }
            return mainlist;
        }
        if (target < 0)
            return mainlist;
        list.add(nums[curr]);
        helper(nums, target - nums[curr], list, mainlist, curr);
        list.remove(list.size() - 1);
        helper(nums, target, list, mainlist, curr + 1);
        return mainlist;
    }
}
