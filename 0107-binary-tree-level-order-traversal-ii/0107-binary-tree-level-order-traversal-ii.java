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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<List<Integer>> ans=new LinkedList<List<Integer>>();
        if(root==null)
            return ans;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int num=queue.size();
            List<Integer> temp=new LinkedList<>();
            for(int i=0;i<num;i++)
            {
                if(queue.peek().left!=null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right!=null)
                    queue.offer(queue.peek().right);
                temp.add(queue.poll().val);
                
            }
            ans.add(0,temp);
            //Collections.reverse(ans);
            
        }
        return ans;
    }
}