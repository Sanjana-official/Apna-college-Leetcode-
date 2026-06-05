class Code139 {
    // bfs method
    // public boolean canFinish(int numCourses, int[][] prerequisites) {
    //      List<List<Integer>> graph = new ArrayList<>();
    //     int[] indegree = new int[numCourses];

    //     // Initialize graph
    //     for (int i = 0; i < numCourses; i++) {
    //         graph.add(new ArrayList<>());
    //     }

    //     // Build graph
    //     for (int[] pre : prerequisites) {
    //         int course = pre[0];
    //         int prereq = pre[1];

    //         graph.get(prereq).add(course);
    //         indegree[course]++;
    //     }

    //     // Queue for courses with no prerequisites
    //     Queue<Integer> queue = new LinkedList<>();

    //     for (int i = 0; i < numCourses; i++) {
    //         if (indegree[i] == 0) {
    //             queue.offer(i);
    //         }
    //     }

    //     int count = 0;

    //     while (!queue.isEmpty()) {
    //         int curr = queue.poll();
    //         count++;

    //         for (int next : graph.get(curr)) {
    //             indegree[next]--;

    //             if (indegree[next] == 0) {
    //                 queue.offer(next);
    //             }
    //         }
    //     }

    //     return count == numCourses;
    // }


    // dfs method
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());

        for (int[] pre : prerequisites)
            adj.get(pre[1]).add(pre[0]);

        boolean[] vis = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++)
            if (!vis[i] && dfs(i, adj, vis, path)) return false;

        return true;
    }

    private boolean dfs(int node, List<List<Integer>> adj, boolean[] vis, boolean[] path) {
        vis[node] = path[node] = true;

        for (int next : adj.get(node))
            if (!vis[next] && dfs(next, adj, vis, path)) return true;
            else if (path[next]) return true;
            
        path[node] = false;
        return false;
    }
}