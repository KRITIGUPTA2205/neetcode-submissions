class Solution {
    int maxA=0;
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    int a =dfs(i,j,m,n,grid);
                    maxA=Math.max(maxA,a);
                    
                }
            }
        }
        return maxA;
    }
    public int dfs(int i,int j,int m,int n,int[][] grid){
        if(i>=m||j>=n||i<0||j<0||grid[i][j]==0) return 0;
        grid[i][j]=0;
        return 1+
        dfs(i+1,j,m,n,grid)+
        dfs(i,j+1,m,n,grid)+
        dfs(i-1,j,m,n,grid)+
        dfs(i,j-1,m,n,grid);
    }
}
