class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr= new ArrayList<>();
        curr.add(0);
        dfs(0, graph.length - 1, graph, curr, ans);
        return ans;
    }
    private void dfs(int node,int target,int[][]graph,List<Integer>path, List<List<Integer>>ans){
        if(node==target){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int neighbour:graph[node]){
            path.add(neighbour);
            dfs(neighbour,target,graph,path,ans);
            path.remove(path.size()-1);
        }
    
    }
}