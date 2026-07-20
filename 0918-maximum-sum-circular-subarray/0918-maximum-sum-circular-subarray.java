class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int bestmax=nums[0];
        int sum1=nums[0];
        for(int i=1;i<n;i++){
            bestmax=Math.max(bestmax+nums[i],nums[i]);
            sum1=Math.max(bestmax,sum1);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int bestending=nums[0];
        int sum2=nums[0];
        for(int i=1;i<n;i++){
            bestending=Math.min(bestending+nums[i],nums[i]);
            sum2=Math.min(sum2,bestending);
        }
        if(sum1<0){
            return sum1;
        }
        return Math.max(sum1,(sum-sum2));
        
    }
}