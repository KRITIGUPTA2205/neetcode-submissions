class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(0,nums,result,path);
        return result;
    }
    public void backtrack(int start,int[] nums,List<List<Integer>> result,List<Integer> path){
        result.add(new ArrayList<>(path));
        for(int i=start;i<nums.length;i++){
            path.add(nums[i]);
            backtrack(i+1,nums,result,path);
            path.remove(path.size()-1);
        }
    }
}
