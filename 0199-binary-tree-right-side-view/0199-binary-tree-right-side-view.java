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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>res=new LinkedList<>();
        rightview(root,res,0);
        return res;
    }
    public void rightview(TreeNode curr,List<Integer>res,int level)
    {
        if(curr==null)
            return;
        if(level==res.size())
            res.add(curr.val);
        rightview(curr.right,res,level+1);
        rightview(curr.left,res,level+1);
        
    }
}