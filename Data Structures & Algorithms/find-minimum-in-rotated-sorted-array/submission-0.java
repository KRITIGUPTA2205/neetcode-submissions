class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
          int mid=low+(high-low)/2;
          if(nums[mid]<nums[high]){
            //right side is sorted so min in left side
            high=mid;
          }else{
            low=mid+1;
          }

        }
       return nums[low];
        
    }
}
