class Solution {
    public int[] searchRange(int[] nums, int target) {
       int res1=-1;
       int res2=-1;
       int low=0;
       int high=nums.length-1;
       while(low<=high){
        int mid=(high+low)/2;
        if(nums[mid]==target){
            res1=mid;
            high=mid-1;
        }else if(nums[mid]>target){
            high=mid-1;
        }else{
            low=mid+1;
        }
       }
       low=0;
       high=nums.length-1;
       while(low<=high){
        int mid2=(high+low)/2;
        if(nums[mid2]==target){
            res2=mid2;
            low=mid2+1;
        }else if(nums[mid2]>target){
            high=mid2-1;
        }else{
            low=mid2+1;
        }
       }
       int ans[]={res1,res2};
       return ans;
    }
}