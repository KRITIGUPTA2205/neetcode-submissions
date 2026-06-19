class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ff=0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1) ff++;
                if(grid[i][j]==2) q.add(new int[]{i,j});
            }
        }
        if(ff==0) return 0;
        int time=0;
        int[][]dir={{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int size=q.size();
            boolean re=false;
            for(int i=0;i<size;i++){
            int []cell=q.poll();
            int r=cell[0];
            int c=cell[1]; 
            for(int[]d:dir){
                int nr=r+d[0];
                int nc=c+d[1];
                if(nr<0||nc<0||nr>=m||nc>=n||grid[nr][nc]==0) continue;
                if(grid[nr][nc]==1){
                    grid[nr][nc]=2;
                    ff--;
                    q.add(new int[]{nr,nc});
                    re=true;
                }
            }
            }
            if(re==true)time++;
        }
        if(ff==0) return time;
        return -1;
    }
}
