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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> s=new LinkedList<>();
        if(root==null)
            return s;
        if(root.left==null && root.right==null)
        {
            s.add(Integer.toString(root.val));
             return s;
        }
        for(String i:binaryTreePaths(root.left))
        {
            s.add(Integer.toString(root.val)+"->"+i);
        }
        
        for(String i:binaryTreePaths(root.right))
        {
            s.add(Integer.toString(root.val)+"->"+i);
        }
        return s;
        
        
    }
}