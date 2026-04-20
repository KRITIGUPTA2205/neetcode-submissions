class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int key : map.keySet()){
            q.offer(key);
            if(q.size()>k){
                q.poll();
            }
        }
        int r[]= new int[k];
        int index=0;
        while(!q.isEmpty()){
        r[index]=q.poll();
        index++;
        }
        return r;
     }
}
