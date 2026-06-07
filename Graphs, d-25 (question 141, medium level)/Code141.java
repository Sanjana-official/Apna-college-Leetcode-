import java.util.*;

class Code141 {

    //dfs method


    // public int[] findRedundantConnection(int[][] edges) {
    //     UnionFind uf = new UnionFind(edges.length);
    //     for (int[] edge : edges) {
    //         int first = uf.find(edge[0] - 1);
    //         int second = uf.find(edge[1] - 1);

    //         if (first == second) {
    //             return new int[] {edge[0], edge[1]};
    //         } else {
    //             uf.union(first, second);
    //         }
    //     }
    //     return null;
    // }

    // static class UnionFind {
    //     private final int[] parent;
    //     private final int[] rank;

    //     public UnionFind(int size) {
    //         parent = new int[size];
    //         rank = new int[size];
    //         for (int i = 0; i < size; i++) {
    //             parent[i] = i;
    //             rank[i] = 1;
    //         }
    //     }

    //     public int find(int x) {
    //         if (parent[x] != x) {
    //             parent[x] = find(parent[x]);
    //         }
    //         return parent[x];
    //     }

    //     public void union(int x, int y) {
    //         int rootX = find(x);
    //         int rootY = find(y);
    //         if (rootX != rootY) {
    //             if (rank[rootX] > rank[rootY]) {
    //                 parent[rootY] = rootX;
    //             } else if (rank[rootX] < rank[rootY]) {
    //                 parent[rootX] = rootY;
    //             } else {
    //                 parent[rootY] = rootX;
    //                 rank[rootX]++;
    //             }
    //         }
    //     }
    // }



    // bfs method
    int n;

    private boolean bfs(Map<Integer, List<Integer>> graph, int start, int end) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            if (curr == end) {
                return true;
            }

            visited[curr] = true;

            for (int neighbor : graph.getOrDefault(curr, new ArrayList<>())) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                }
            }
        }

        return false;
    }

    public int[] findRedundantConnection(int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        n = edges.length;

        for (int i = 0; i < n; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            // If both nodes already exist and a path already exists between them,
            // then adding this edge creates a cycle.
            if (graph.containsKey(u) &&
                graph.containsKey(v) &&
                bfs(graph, u, v)) {

                return edges[i];
            }

            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        return new int[0];
    }
}
