class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,result,path);
        return result;
    }
    public void backtrack(int[]nums,int start,List<List<Integer>> result,List<Integer> path){
        result.add(new ArrayList<>(path));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            path.add(nums[i]);
            backtrack(nums,i+1,result,path);
            path.remove(path.size()-1);
        }
    }
}
