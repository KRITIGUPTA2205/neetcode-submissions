class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int s : stones){
            maxheap.add(s);
        }
        
         while(maxheap.size()>=2){
            int first=maxheap.poll();
            int second=maxheap.poll();
            if(second<first){
               maxheap.add(first-second);
            }
        }
       if(maxheap.size()==0) return 0;
       return maxheap.poll();

    }
}
