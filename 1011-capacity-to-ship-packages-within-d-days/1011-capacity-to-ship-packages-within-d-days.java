class Solution {
    public boolean CapacityOfBelt(int [] arr,int d,int guess,int n){
        int current=0;
        int ND=1;
        for(int i=0;i<n;i++){
            if(current+arr[i]<=guess){
                current+=arr[i];
            }else{
                ND++;
                current=arr[i];
            }
        }
        if(ND<=d){
            return true;
        }
       return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int high=0;
        int low=-1;
        for(int i=0;i<n;i++){
            high+=weights[i];
            if(weights[i]>low){
                low=weights[i];
            }
        }
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(CapacityOfBelt(weights,days,mid,n)==true){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans ;

    }
}