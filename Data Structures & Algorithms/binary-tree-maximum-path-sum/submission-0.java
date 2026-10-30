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
    int path(TreeNode root,int[] res){
        if(root==null){
            return 0;
        }
        int left=Math.max(path(root.left,res),0);
        int right=Math.max(path(root.right,res),0);
        res[0]=Math.max(res[0],root.val+left+right);
        return root.val+Math.max(left,right);
    }

    public int maxPathSum(TreeNode root) {
        if(root==null)return 0;
        int[] res={root.val};
       path(root,res);
       return res[0];
    }
}
