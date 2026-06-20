class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for(int []pre:prerequisites){
            int r=pre[0];
            int c=pre[1];
            graph.get(c).add(r);
            indegree[r]++;
        }
        int [] re = new int[numCourses];
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int cell=q.poll();
            result.add(cell);
            for(int c : graph.get(cell)){
                indegree[c]--;
                if(indegree[c]==0){
                q.add(c);
            }
            }
        }
        if(result.size()!=numCourses) return new int[]{};
        for(int i=0;i<result.size();i++){
            re[i]=result.get(i);
        }
        return re;
    }
}
