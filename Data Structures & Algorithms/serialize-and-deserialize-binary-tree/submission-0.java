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

public class Codec {
    void dfsSerialize(TreeNode root,List<String> res){
        if(root==null){
            res.add("#");
            return;
        }
        res.add(String.valueOf(root.val));
        dfsSerialize(root.left,res);
        dfsSerialize(root.right,res);
    }

    TreeNode dfsDeserialize(List<String>res ,int[] i){
        if(res.get(i[0]).equals("#")){
            i[0]++;
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(res.get(i[0]++)));
        root.left=dfsDeserialize(res,i);
        root.right=dfsDeserialize(res,i);
        return root;
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> res=new ArrayList<>();
        dfsSerialize(root,res);
        return String.join(",",res);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> res=new ArrayList<>(Arrays.asList(data.split(",")));
        int[] i={0};
        return dfsDeserialize(res,i);
    }
}
