/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int goodNodes(TreeNode root) {
        if (root == null)
            return 0;
        return helper(root, root.val);
    }
    public int helper(TreeNode root, int currMax) {
        if (root == null)
            return 0;
        int cnt = 0;
        if (root.val >= currMax)
            cnt = 1;
        currMax = Math.max(currMax, root.val);
        cnt += helper(root.left, currMax);
        cnt += helper(root.right, currMax);
        return cnt;
    }
}
