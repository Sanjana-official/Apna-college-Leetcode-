class Code146 {
    boolean[] visited;
    int[][] adjMatrix;
    int[][]dp;
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k){
        //declaring DS

        dp = new int[n][n + 1];
        visited = new boolean[n];
        adjMatrix = new int[n][n];

        //populating  adjacency matrix 

        for(int[] edge : flights){
            adjMatrix[edge[0]][edge[1]] = edge[2];
        }

        //calling dfs-Fn

        dfs(src,0,k + 1,dst);

        //finding the min cost to reach dst in all remaining stops

        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n + 1; i++){
            if(dp[dst][i] != 0)
                min = Math.min(dp[dst][i],min);
        }

        //if min is Inter.max then there is no reachable path at most k stops then return -1

        return min == Integer.MAX_VALUE ? -1 : min;
    }
    private void dfs(int node,int cost,int k,int dst){
        if(node == dst && k >= 0){
            dp[dst][k] = Math.min(cost,dp[dst][k] == 0 ? Integer.MAX_VALUE : dp[dst][k]);
            return;
        }
        if(k == 0 && node != dst){
            return;
        }
        visited[node] = true;
        for(int i = 0 ; i < visited.length ; i++){
            if(!visited[i] && adjMatrix[node][i] != 0){
                if(dp[i][k] == 0 || dp[i][k] > cost + adjMatrix[node][i]){ 
                    dfs(i,cost + adjMatrix[node][i],k - 1,dst);
                    dp[i][k] = cost + adjMatrix[node][i];
                }
            }
        }
        visited[node] = false;
    }
}