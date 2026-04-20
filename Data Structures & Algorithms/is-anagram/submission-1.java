class Solution {
    public boolean isAnagram(String s, String t) {
        char[] key1=s.toCharArray();
        Arrays.sort(key1);
        char[] key2=t.toCharArray();
        Arrays.sort(key2);
        if (Arrays.equals(key1,key2)) return true;
        return false;
    }
}
