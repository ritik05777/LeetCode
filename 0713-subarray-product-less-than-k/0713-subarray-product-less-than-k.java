class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int counter=0;
        int low=0;
        int high=0;
        int product=1;
        for(high=0;high<n;high++){
            product=product*nums[high];
            while(product>=k){
                 product /= nums[low++];
            }
            
            counter+=high-low+1;
        }  
        return counter; 
    }
}