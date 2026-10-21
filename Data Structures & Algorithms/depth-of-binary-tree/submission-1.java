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
    public int maxDepth(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        int depth=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int l=q.size();
            for(int i=0;i<l;i++){
                TreeNode node=q.poll();
                if(node.left!=null)
                q.add(node.left);
                if(node.right!=null)
                q.add(node.right);
            }
            depth++;
        }

        return depth;
    }
}
