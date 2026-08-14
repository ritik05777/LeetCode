class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=-1;
        int res=-1;
        for(int i=0;i<piles.length;i++){
           if(piles[i]>high){
            high=piles[i];
           }
        }
        while(low<=high){
            int mid=(low+high)/2;
            long hour=guess(piles,mid);
            if(hour>h){
                low=mid+1;
            }else{
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
     public long guess(int[] piles,int mid){
        long h=0;
        for(int i=0;i<piles.length;i++){
            h=h+piles[i]/mid;
            if(piles[i]%mid!=0){
                h++;
            }
        }
        return h;
    }
}