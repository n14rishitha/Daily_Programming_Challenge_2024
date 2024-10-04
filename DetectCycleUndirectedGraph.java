import java.util.*;

public class DetectCycleUndirectedGraph {

    // Function to detect cycle in an undirected graph
    public boolean isCycle(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];
        
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, visited, adj)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Helper function to perform DFS and detect cycle
    private boolean dfs(int node, int parent, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;
        
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, node, visited, adj)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;  // A cycle is detected
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example Test Case 1
        int V1 = 5;
        List<List<Integer>> adj1 = new ArrayList<>();
        for (int i = 0; i < V1; i++) adj1.add(new ArrayList<>());
        adj1.get(0).add(1); adj1.get(1).add(0);
        adj1.get(1).add(2); adj1.get(2).add(1);
        adj1.get(2).add(3); adj1.get(3).add(2);
        adj1.get(3).add(4); adj1.get(4).add(3);
        adj1.get(4).add(0); adj1.get(0).add(4);
        
        DetectCycleUndirectedGraph graph1 = new DetectCycleUndirectedGraph();
        System.out.println(graph1.isCycle(V1, adj1)); // Output: true

        // Example Test Case 2
        int V2 = 3;
        List<List<Integer>> adj2 = new ArrayList<>();
        for (int i = 0; i < V2; i++) adj2.add(new ArrayList<>());
        adj2.get(0).add(1); adj2.get(1).add(0);
        adj2.get(1).add(2); adj2.get(2).add(1);

        DetectCycleUndirectedGraph graph2 = new DetectCycleUndirectedGraph();
        System.out.println(graph2.isCycle(V2, adj2)); // Output: false

        // Example Test Case 3
        int V3 = 1;
        List<List<Integer>> adj3 = new ArrayList<>();
        for (int i = 0; i < V3; i++) adj3.add(new ArrayList<>());

        DetectCycleUndirectedGraph graph3 = new DetectCycleUndirectedGraph();
        System.out.println(graph3.isCycle(V3, adj3)); // Output: false
    }
}
