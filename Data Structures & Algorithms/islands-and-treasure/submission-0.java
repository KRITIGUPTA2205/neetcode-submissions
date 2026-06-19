class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    q.add(new int[]{i,j});
                }
            }
        }
        int [][]dir={{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int[]cell=q.poll();
            int r =cell[0];
            int c =cell[1];
            for(int[] d : dir){
                int nr=r+d[0];
                int nc=c+d[1];
                if(nr<0||nc<0||nr>=m||nc>=n||grid[nr][nc]!=Integer.MAX_VALUE) continue;
                grid[nr][nc]=grid[r][c]+1;
                q.add(new int[]{nr,nc});
            }
        }
        
    }
}
