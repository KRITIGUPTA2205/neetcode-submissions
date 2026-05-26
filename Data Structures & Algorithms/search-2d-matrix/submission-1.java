class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        if(target<matrix[0][0]||target>matrix[m-1][n-1]) return false;
        int row=0;
        while(row<m){
            if(target>=matrix[row][0]&&target<=matrix[row][n-1]){
                int low=0;
                int high=n-1;
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(target==matrix[row][mid]) return true;
                    else if (target<matrix[row][mid]) high=mid-1;
                    else low=mid+1;
                }
                return false;
            }
            else{
                row+=1;
            }
        }
        return false;
    }
}
