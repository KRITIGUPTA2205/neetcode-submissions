class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        boolean[][] pasvis=new boolean[m][n];
        boolean atl[][] = new boolean[m][n];
        for(int i=0;i<m;i++){
            dfs(heights,i,0,pasvis,-1);
            dfs(heights,i,n-1,atl,-1);
        }
        for(int j=0;j<n;j++){
            dfs(heights,0,j,pasvis,-1);
            dfs(heights,m-1,j,atl,-1);
        }
        
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pasvis[i][j] && atl[i][j]){
                    result.add(Arrays.asList(i,j));
                }
            }
        }
        return result;
    }
    public void dfs(int[][] heights,int i,int j,boolean[][] visited,int prev){
        int m=heights.length;
        int n=heights[0].length;
        if(i>=m||i<0||j>=n||j<0||visited[i][j]==true||heights[i][j]<prev){
          return;
        }
        visited[i][j]=true;
        dfs(heights,i+1,j,visited,heights[i][j]);
        dfs(heights,i-1,j,visited,heights[i][j]);
        dfs(heights,i,j+1,visited,heights[i][j]);
        dfs(heights,i,j-1,visited,heights[i][j]);
    }
}
