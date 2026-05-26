class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int first=0;
        int seccond=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    first=i;
                    seccond=j;  
                }
            }
        }
        int [] arr={first,seccond};
        return arr;
    }
}