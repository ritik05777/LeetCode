class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int res=nums[0];
        int minending=0;
        int maxending=0;
        for(int i=0;i<n;i++){
            int maxsum=nums[i]+maxending;
            int minsum=nums[i]+minending;
            maxending=Math.max(nums[i],maxsum);
            minending=Math.min(nums[i],minsum);
            res=Math.max(res,Math.max(Math.abs(maxending),Math.abs(minending)));
        }
        return res;
        
    }
}