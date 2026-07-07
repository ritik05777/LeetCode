class Solution {
     public  void swap (int [] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int mid=0;
        while(high>=mid){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if(nums[mid]==2){
                swap(nums,high,mid);
                    high--;
            }else{
                mid++;
            }
        }
        
    }
    
}