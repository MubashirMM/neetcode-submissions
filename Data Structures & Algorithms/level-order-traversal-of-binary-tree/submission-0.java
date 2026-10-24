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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;

        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> r = new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode node=q.poll();
                r.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            res.add(r);

        }
        return res;
        
    }
}
