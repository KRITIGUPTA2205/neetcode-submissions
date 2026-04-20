class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int len=0;
        for(int num : nums){
            set.add(num);
        }
        int lng=0;
        for(int num:nums){
            if(!set.contains(num-1)){
                int cn=num;
                int length=1;
                while(set.contains(cn+1)){
                    cn++;
                    length++;
                }
                lng=Math.max(lng,length);
            }
        }
        return lng;
    }
}
