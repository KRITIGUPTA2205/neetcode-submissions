class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      List<List<Integer>> graph=new ArrayList<>();
      int []indegree = new int[numCourses];
      for(int i=0;i<numCourses;i++){
        graph.add(new ArrayList<>());
      } 
      for(int [] p : prerequisites){
        int r = p[0];
        int c = p[1];
        graph.get(c).add(r);
        indegree[r]++;
      } 
      Queue<Integer> q = new LinkedList<>();
      for(int i=0;i<numCourses;i++){
        if(indegree[i]==0){
            q.add(i);
        }
      }
      int c=0;
      while(!q.isEmpty()){
        int cur=q.poll();
        c++;
        for(int nei:graph.get(cur)){
            indegree[nei]--;
            if(indegree[nei]==0){
                q.add(nei);
            }
        }
      }
      if(c==numCourses) return true;
      return false;
    }
}
