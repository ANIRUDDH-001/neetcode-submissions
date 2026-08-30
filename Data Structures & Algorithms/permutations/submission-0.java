class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] vis = new boolean[nums.length];
        List<List<Integer>> mainlist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(nums, vis, mainlist, list);
        return mainlist;
    }
    public void helper(
        int[] nums, boolean[] vis, List<List<Integer>> mainlist, List<Integer> list) {
        if (list.size() == nums.length) {
            mainlist.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!vis[i]) {
                vis[i] = true;
                list.add(nums[i]);
                helper(nums, vis, mainlist, list);
                vis[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}
