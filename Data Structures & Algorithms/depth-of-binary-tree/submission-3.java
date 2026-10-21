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
    class Pair{
        int depth;
        TreeNode node;
    Pair(int depth,TreeNode node){
        this.node=node;
        this.depth=depth;

        }
    }

    public int maxDepth(TreeNode root) {
        
        if(root==null){
            return 0;
        }

        int depth=0;
        Stack<Pair> s=new Stack<>();
        s.add(new Pair(1,root));
        while(!s.isEmpty()){
            Pair p=s.pop();
            TreeNode node=p.node;
            depth=Math.max(depth,p.depth);
                if(node.left!=null)
                s.add(new Pair(p.depth+1,node.left));
                if(node.right!=null)
                s.add(new Pair(p.depth+1,node.right));
            }
              return depth;
        }

      
}

