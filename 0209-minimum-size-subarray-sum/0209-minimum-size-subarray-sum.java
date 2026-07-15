class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res=Integer.MAX_VALUE;
        int high=0;
        int low=0;
        int sum=0;
        for(high=0;high<nums.length;high++){
            sum+=nums[high];
            while(sum>=target){
                sum=sum-nums[low];
                int len=high-low+1;
                res=Math.min(res,len);
                low++;
                 
            }

        }
        if(res==Integer.MAX_VALUE){
            res=0;
        }

        return res;
        
    }
}