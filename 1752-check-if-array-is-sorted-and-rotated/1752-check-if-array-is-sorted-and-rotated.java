class Solution {
    public boolean check(int[] nums) {
        int dec=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                dec++;
            }
        }
        if(dec==0|| dec==1){
            return true;
        }else{
            return false;
        }
        
    }
}