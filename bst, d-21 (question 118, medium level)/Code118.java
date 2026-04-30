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
// class BSTIterator
class Code118 {

    TreeNode r ;
    List<Integer> t = new ArrayList<>();
    private void in(TreeNode root){
        if(root==null){
            return;
        }
        in(root.left);
        t.add(root.val);
        in(root.right);
    }
    public BSTIterator(TreeNode root) {
        r = root;
        in(root); 
    }
    int i = 0;
    public int next() {
        return t.get(i++);
    }
    
    public boolean hasNext() {
       if(i<t.size()) return true;
       return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */