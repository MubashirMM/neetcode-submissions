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
    List<Integer> res=new ArrayList<>();
    void valid(TreeNode root){
        if(root==null){
            return;
        }
        valid(root.left);
        
        res.add(root.val);
        valid(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        int prev=Integer.MIN_VALUE;
        valid(root);
       for(int val:res){
if(prev>=val){
    return false;
}
prev=val;
       }
       return true;

    }
}
