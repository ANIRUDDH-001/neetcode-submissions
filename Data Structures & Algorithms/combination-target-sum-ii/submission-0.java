class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> mainlist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, mainlist, list, 0);
        return mainlist;
    }
    public void helper(
        int nums[], int target, List<List<Integer>> mainlist, List<Integer> list, int curr) {
        if (curr == nums.length) {
            if (target == 0) {
                mainlist.add(new ArrayList<>(list));
            }
            return;
        }
        if (target < 0)
            return;
        list.add(nums[curr]);
        helper(nums, target - nums[curr], mainlist, list, curr + 1);
        list.remove(list.size() - 1);
        while (curr + 1 < nums.length && nums[curr] == nums[curr + 1]) curr++;
        helper(nums, target, mainlist, list, curr + 1);
    }
}
