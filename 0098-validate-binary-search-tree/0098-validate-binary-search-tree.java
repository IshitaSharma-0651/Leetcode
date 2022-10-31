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
    public boolean isValidBST(TreeNode root) {
        return find( root, Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean find(TreeNode root,long minn,long maxx)
    {
        if(root==null)
            return true;
        if(root.val>=maxx || root.val<=minn)
            return false;
        return find(root.left,minn,root.val) && find(root.right,root.val,maxx);
    }
}