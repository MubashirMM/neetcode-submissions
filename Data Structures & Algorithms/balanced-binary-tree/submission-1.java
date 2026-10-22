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
    int height(TreeNode node){
        if(node==null) return 0;
        int l=height(node.left);
        int r=height(node.right);
        if(Math.abs(l-r)>1 || l==-1 || r==-1)
        return -1;
        return 1+Math.max(l,r);
        
    }
    public boolean isBalanced(TreeNode root) {
       return height(root)>=0;
        
    }
}
