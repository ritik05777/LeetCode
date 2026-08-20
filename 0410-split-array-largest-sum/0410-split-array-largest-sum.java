class Solution {
    public boolean Ksplit(int[] a,int k,long guess,int n){
      long CurrentSum=0;
      int counter=1;
      for(int i=0;i<n;i++){
        if(CurrentSum+a[i]<=guess){
            CurrentSum+=a[i];
        }else{
            counter++;
            CurrentSum=a[i];
        }
         
      }
       if(counter<=k){
            return true;
        }
        return false;
    }
    public int splitArray(int[] nums, int k) {
        long low=-1;
        long high=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            high+=nums[i];
            if(nums[i]>low){
                low=nums[i];
            }
        }
        long ans=-1;
        while(low<=high){
            long mid=(low+high)/2;
            if(Ksplit(nums,k,mid,n)==true){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return(int) ans;
    }
}