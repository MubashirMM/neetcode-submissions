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
    int count=0;
    void find(TreeNode root,int max){
        if(root==null) return;
        if(root.val>=max){
            max=Math.max(max,root.val);
            count++;
        }
        find(root.left,max);
        find(root.right,max);
    }
    public int goodNodes(TreeNode root) {
        find(root,Integer.MIN_VALUE);
       
       return count;
       
        }
        
    }