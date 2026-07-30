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
    boolean isbal=true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        return isbal;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        if(Math.abs(leftHeight-rightHeight)>1) isbal=false;
        return Math.max(leftHeight, rightHeight)+1;
    }
}
