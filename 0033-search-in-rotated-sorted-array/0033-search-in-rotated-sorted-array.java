class Solution {
    public int search2(int low,int high,int target,int[]nums){
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    } 
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        int low1=0;
        int high1=low-1;
        int low2=low;
        int high2=nums.length-1;
        int ans1=search2(low1,high1,target,nums);
        if(ans1==-1){
           return search2(low2,high2,target,nums);
        }if(ans1!=-1){
            return ans1;
        }
        
        return -1;

    }
}