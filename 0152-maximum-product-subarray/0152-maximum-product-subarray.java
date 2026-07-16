class Solution {
    public int maxProduct(int[] nums) {
        int  endingmax=nums[0];
        int  endingmin=nums[0];
        int maxproduct=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            int p1=endingmax*nums[i];
            int p2=endingmin*nums[i];
           endingmax=Math.max(nums[i],Math.max(p1,p2));
           endingmin=Math.min(nums[i],Math.min(p1,p2));

            maxproduct=Math.max(maxproduct,Math.max(endingmax,endingmin));
             
              
        }
        return maxproduct;
    }
}