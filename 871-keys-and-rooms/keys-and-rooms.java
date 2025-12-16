class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        dfs(visited, rooms, 0);
        for(int i=0; i<n; i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;


        
    }
    private static void dfs(boolean[] visited, List<List<Integer>> graph, int node){
        visited[node] = true;
        for(int n: graph.get(node)){
            if(!visited[n]){
                dfs(visited, graph, n);
            }
        }
    }
}