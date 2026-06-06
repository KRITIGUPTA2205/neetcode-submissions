class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(0,nums,target,result,path);
        return result;
    }
    public void backtrack(int start,int[] nums,int target,List<List<Integer>> result,List<Integer> path){
        if(target==0){
        result.add(new ArrayList<>(path));
        }
        if(target<0) return;
        for(int i=start;i<nums.length;i++){
            path.add(nums[i]);
            backtrack(i,nums,target-nums[i],result,path);
            path.remove(path.size()-1);
        }
    }
}
