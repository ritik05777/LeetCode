class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int bestsum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<n;i++){
            int sum=bestsum+nums[i];
            bestsum=Math.max(sum,nums[i]);
            maxsum=Math.max(bestsum,maxsum);

        }
        return maxsum;
        
    }
}