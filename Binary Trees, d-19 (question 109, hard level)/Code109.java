class Code109 {
    public int[][] dp;
    public int maxPower;

    public TreeAncestor(int n, int[] parent) {
        maxPower = (int) (Math.log(n) / Math.log(2)) + 1;
        dp = new int[n][maxPower];

        for (int i = 0; i < n; i++) {
            dp[i][0] = parent[i];
        }

        for (int j = 1; j < maxPower; j++) {
            for (int i = 0; i < n; i++) {
                int ancestor = dp[i][j - 1];
                if (ancestor != -1) {
                    dp[i][j] = dp[ancestor][j - 1];
                } else {
                    dp[i][j] = -1;
                }
            }
        }
    }

    public int getKthAncestor(int node, int k) {
        for (int i = 0; i < maxPower && node != -1; i++) {
            if ((k & (1 << i)) != 0) {
                node = dp[node][i];
            }
        }
        return node;
    }
}

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */