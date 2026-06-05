class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int[] point:points){
            int dist = point[0]*point[0]+point[1]*point[1];
            pq.add(new int[]{dist,point[0],point[1]});
        }
       int [][] result = new int[k][2];
       for(int i=0;i<k;i++){
        int []cur = pq.poll();
        result[i][0]=cur[1];
        result[i][1]=cur[2];
        }
        return result;
    }
}
