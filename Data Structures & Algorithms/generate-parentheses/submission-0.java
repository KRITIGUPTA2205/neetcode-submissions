class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result,"",0,0,n);
        return result;
    }
    public void backtrack(List<String> result,String temp,int open,int close,int n){
        if(temp.length()==2*n) result.add(temp);
        if(open<n){
            backtrack(result,temp+'(',open+1,close,n);
        }
        if(close<open){
            backtrack(result,temp+')',open,close+1,n);
        }
    } 
}
