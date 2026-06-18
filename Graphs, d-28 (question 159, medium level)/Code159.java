import java.util.*;

class Code159 {
    class Pair {
        long dist;
        int node;
        public Pair(int node, long dist) {
            this.dist = dist;
            this.node = node;
        }
    }

    public int countPaths(int n, int[][] roads) {
        int mod = (int)1e9 + 7;
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] road : roads) {
            graph.get(road[0]).add(new Pair(road[1], road[2]));
            graph.get(road[1]).add(new Pair(road[0], road[2]));
        }

        long[] dist = new long[n];
        int[] ways = new int[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        
        dist[0] = 0;
        ways[0] = 1;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Long.compare(a.dist, b.dist));
        pq.offer(new Pair(0, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.node;
            long d = curr.dist;

            if (d > dist[u]) continue;

            for (Pair neighbor : graph.get(u)) {
                int v = neighbor.node;
                long weight = neighbor.dist;

                // Found a strictly shorter path
                if (dist[v] > d + weight) {
                    dist[v] = d + weight;
                    ways[v] = ways[u];
                    pq.offer(new Pair(v, dist[v]));
                } 
                // Found another path of the same shortest length
                else if (dist[v] == d + weight) {
                    ways[v] = (ways[v] + ways[u]) % mod;
                }
            }
        }
        return ways[n - 1];
    }
}