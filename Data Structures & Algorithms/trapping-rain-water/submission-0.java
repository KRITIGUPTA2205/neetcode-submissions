class Solution {
    public int trap(int[] height) {
        int n= height.length;
        int[] left_height=new int[n];
        left_height[0]=0;
        int[] right_height=new int[n];
        right_height[n-1]=0;
        for(int i=1;i<n;i++){
            left_height[i]=Math.max(left_height[i-1],height[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            right_height[i]=Math.max(right_height[i+1],height[i+1]);
        }
        int []trap=new int[n];
        for(int i=0;i<n;i++){
            int x=Math.min(left_height[i],right_height[i])-height[i];
            if(x>=0) trap[i]=x;
            else trap[i]=0;
        }
        int sum=0;
        for(int t : trap){
            sum+=t;
        }
        return sum;
    }
}
