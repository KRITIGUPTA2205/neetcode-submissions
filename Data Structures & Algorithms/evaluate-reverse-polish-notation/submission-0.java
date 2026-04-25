class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String str = tokens[i];
            if(st.size()>=2&&(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/"))){
                int a = st.pop();
                int b = st.pop();
                if(str.equals("+")) st.push(a+b);
                else if(str.equals("-")) st.push(b-a);
                else if(str.equals("*")) st.push(a*b);
                else st.push(b/a);
            }
            else{
            int val=Integer.parseInt(str);
            st.push(val);
        }
        }
    
        return st.pop();
    }
}
