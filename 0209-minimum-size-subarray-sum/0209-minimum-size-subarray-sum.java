class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res=Integer.MAX_VALUE;
        int sum=0;
        int low=0;
        int high=0;
        while(high<nums.length){
            sum+=nums[high];
            while(sum>=target){
                int len=high-low+1;
                res=Math.min(res,len);
                sum-=nums[low];
                low++;
               
            }
            high++;
        }
        if(res==Integer.MAX_VALUE){
            res=0;
        }
        return res;
        
    }
}