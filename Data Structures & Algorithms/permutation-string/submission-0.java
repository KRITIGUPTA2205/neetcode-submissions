class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for( char c : s1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        int left=0;
        int n=s1.length();
        for(int right=0;right<s2.length();right++){
            map2.put(s2.charAt(right),map2.getOrDefault(s2.charAt(right),0)+1);
           while(right-left+1>n){
            map2.put(s2.charAt(left),map2.get(s2.charAt(left))-1);
            if(map2.get(s2.charAt(left))==0) map2.remove(s2.charAt(left));
            left++;
           }
           if(map1.equals(map2)) return true;

        }
        return false;
    }
}
