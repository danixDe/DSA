class Solution {
    public int findCircleNum(int[][] isConnected) {
        int comp = 0;
        boolean[] visited = new boolean[isConnected.length];
        for(int i=0; i<isConnected.length; i++){
            if(!visited[i]){
            dfs(isConnected, visited, i);
            comp++;
            }
        }
        return comp;
    }
    private static void dfs(int[][] graph, boolean[] visited, int node){
        visited[node] = true;
        for(int i=0; i<graph.length; i++){
            if(!visited[i] && graph[node][i]==1){
              dfs(graph, visited, i);
            }

        }
    }
}