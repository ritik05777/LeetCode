class Solution {
    public boolean avlaiblity(int [] candies,long k,int guess,int n){
        long Ncandies=0;
       for(int i=0;i<n;i++){
        Ncandies+=candies[i]/guess;
       }
       if(Ncandies>=k){
        return true;
       }
       return false;
    }
    public int maximumCandies(int[] candies, long k) {
        int n=candies.length;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=candies[i];
        }
        if(sum<k){
            return 0;
        }
        int low=1;
        int high=-1;
        for(int i=0;i<n;i++){
            if(candies[i]>high){
                high=candies[i];
            }
        }
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(avlaiblity(candies,k,mid,n)==true){
               ans=mid;
               low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
         
    }
}