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
    boolean res=true;
    public boolean isBalanced(TreeNode root) {
       depth(root);
        return res;
            
        
    }
    public int depth(TreeNode root)
    {
        if(root==null)
            return 0;
        int lh=depth(root.left);
        int rh=depth(root.right);
        if(Math.abs(lh-rh)>1)
            res=false;
        return ((1+Math.max(lh,rh)));
    }
}