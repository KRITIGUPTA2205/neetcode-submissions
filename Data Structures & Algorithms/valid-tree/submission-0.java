class Solution {
    public boolean validTree(int n, int[][] edges) {
      if(edges.length!=n-1) return false;
      List<List<Integer>> graph = new ArrayList<>();
      for(int i=0;i<n;i++){
        graph.add(new ArrayList<>());
      }
      for(int []e : edges){
        int r = e[0];
        int c = e[1];
        graph.get(r).add(c);
        graph.get(c).add(r);
      }
      Queue<Integer> q = new LinkedList<>();
      q.add(0);
      boolean[]visited=new boolean[n];
      visited[0]=true;
      int count=0;
      while(!q.isEmpty()){
        int c =q.poll();
        count++;
        for(int nei : graph.get(c)){
            if(!visited[nei]){
                visited[nei]=true;
                q.add(nei);
            }
        }
      }
      if(count==n) return true;
      return false;
    }
}
