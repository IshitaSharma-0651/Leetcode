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
    public TreeNode bstFromPreorder(int[] preorder) {
        return find(preorder,Integer.MAX_VALUE,new int []{0});
        
    }
    public TreeNode find (int[]preorder,int bound,int a[])
    {
        if(a[0]==preorder.length|| preorder[a[0]]>bound)
            return null;
        TreeNode root=new TreeNode(preorder[a[0]++]);
        root.left=find(preorder,root.val,a);
        root.right=find(preorder,bound,a);
        return root;
        
    }
}