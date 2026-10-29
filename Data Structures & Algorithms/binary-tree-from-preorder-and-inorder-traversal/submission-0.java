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
    int parentIndex=0;
    Map<Integer,Integer> map=new HashMap<>();

    TreeNode build(int[] preorder, int l, int u){
        if(l>u){
            return null;
        }
        int rootValue=preorder[parentIndex++];
        TreeNode root=new TreeNode(rootValue);
        int index=map.get(rootValue);
        root.left=build(preorder,l,index-1);
        root.right=build(preorder,index+1,u);
        return root;
       
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
       return build(preorder,0,inorder.length-1);
    }
}
