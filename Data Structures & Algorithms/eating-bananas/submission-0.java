class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxb=piles[0];
        for(int pile : piles){
            maxb=Math.max(maxb,pile);
        }
        int low=1;
        int high=maxb;
        int result=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(eat(mid,piles,h)){
                result=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
            
        }
        return result;
    }
    public boolean eat(int speed,int[] piles,int h){
        int t=0;
        for(int pile:piles){
           t+=Math.ceil((double)pile/speed);
        }
        if(t<=h) return true;
        return false;
    }
}
