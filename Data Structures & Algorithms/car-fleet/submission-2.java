class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> st = new Stack<>();
        int [][] pair = new int[position.length][2];
        for(int i=0;i<position.length;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }
        Arrays.sort(pair,(a,b)->a[0]-b[0]);
        for(int i=0;i<position.length;i++){
            double time = (double)(target-pair[i][0])/pair[i][1];
            while(!st.isEmpty()&&time>=st.peek()){
                st.pop();
            }
            st.push(time);
        }
        return st.size();
    }
}
