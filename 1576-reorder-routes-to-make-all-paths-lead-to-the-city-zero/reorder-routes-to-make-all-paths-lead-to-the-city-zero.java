class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<int[]>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] c: connections){
            int p = c[0];
            int ne = c[1];
            graph.get(p).add(new int[]{ne, 1});
            graph.get(ne).add(new int[]{p, 0});
        }
        int curr = dfs(0, new boolean[n], graph);
        return curr;
    }

    private static int dfs(int node, boolean[] visited, List<List<int[]>> graph) {
        visited[node] = true;
        int reorder = 0;
        for (int[] e : graph.get(node)) {
            int next = e[0], w = e[1];
        if(!visited[next]){
                        reorder+=w;
            reorder+=dfs(next, visited, graph);
        }
        }
        return reorder;
        }
}