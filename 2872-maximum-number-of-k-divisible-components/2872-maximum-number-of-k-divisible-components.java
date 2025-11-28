class Solution {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
  
        // Step 1: build adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            int a = e[0], b = e[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // Step 2: compute total sum
        long total = 0;
        for (int v : values) total += v;
        if (total % k != 0) {
            // no valid split possible
            return 0;
        }

        // Step 3: DFS and count components
        boolean[] visited = new boolean[n];
        int[] count = new int[1];  // using array to mutate inside lambda/dfs

        dfs(0, -1, graph, values, k, count);

        return count[0];
    }

    private long dfs(int node, int parent, List<List<Integer>> graph,
                     int[] values, int k, int[] count) {
        long sum = values[node];

        for (int nei : graph.get(node)) {
            if (nei == parent) continue; // avoid going back
            long childSum = dfs(nei, node, graph, values, k, count);
            sum += childSum;
        }

        // If this subtree can form a k-divisible component
        if (sum % k == 0) {
            count[0]++;  // one component formed here
            return 0;    // this part is now "cut off"
        }

        // otherwise, pass the sum up
        return sum;
    
 
    }
}