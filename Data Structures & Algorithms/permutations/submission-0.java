class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        boolean [] visited = new boolean[nums.length];
        backtrack(0,nums,result,path,visited);
        return result;
    }
    public void backtrack(int start,int[] nums,List<List<Integer>> result,List<Integer> path,boolean[] visited){
        if(path.size()==nums.length){
            result.add(new ArrayList<>(path));
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            path.add(nums[i]);
            visited[i]=true;
            backtrack(i+1,nums,result,path,visited);
            path.remove(path.size()-1);
            visited[i]=false;
        }
    }
}
