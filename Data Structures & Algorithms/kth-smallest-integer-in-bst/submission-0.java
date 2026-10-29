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
    void k(TreeNode root){
          if(root==null){
            return;
        }
        k(root.left);
        res.add(root.val);
        k(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        k(root);
      return res.get(k-1);

    }
}
