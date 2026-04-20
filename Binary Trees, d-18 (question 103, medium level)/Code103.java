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
class Code103 {
    private int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        transformation(root);
        return root;
    }

    public void transformation(TreeNode root){

        if(root == null){
            return;
        }

        transformation(root.right);

        root.val = root.val + sum;
        sum = root.val;

        transformation(root.left);
        
    }
}