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
class Code106 {
    private class Pair {
        TreeNode node;
        int index;

        Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        int ans = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            int size = queue.size();
            int first = 0;
            int last = 0;
            int mini = queue.peek().index;
            for (int i = 0; i < size; i++) {
                Pair p = queue.poll();
                TreeNode curr_node = p.node;
                int index = p.index - mini;

                if(i == 0) first = index;
                if(i == size-1) last = index;
                if(curr_node.left != null){
                    queue.offer(new Pair(curr_node.left, 2*index + 1));
                }
                if(curr_node.right != null){
                    queue.offer(new Pair(curr_node.right,2*index + 2));
                }
            }

            ans = Math.max(ans, last - first+1);
        }

        return ans;
    }
}