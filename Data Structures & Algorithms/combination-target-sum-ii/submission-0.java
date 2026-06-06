class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,candidates,target,result,path);
        return result;

    }
    public void backtrack(int start,int[] candidates,int target,List<List<Integer>> result,List<Integer> path){
        if(target==0){
            result.add(new ArrayList<>(path));
        }
        if(target<0) return;
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]) continue;
            path.add(candidates[i]);
            backtrack(i+1,candidates,target-candidates[i],result,path);
            path.remove(path.size()-1);
        }
    }
}
