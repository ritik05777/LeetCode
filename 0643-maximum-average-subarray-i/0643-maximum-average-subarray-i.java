class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int low=0;
        int high=k-1;
        int sum=0;
        double res=-Double.MAX_VALUE;
        for(int i=0;i<=high;i++){
            sum+=nums[i];
            
        }
           
            while(high<n){
                double avg=(double)sum/(double)k;
                low++;
                high++;
                if(high<n){
                    sum=sum-nums[low-1]+nums[high];
                }
                res=Math.max(res,avg);
                

            }
            return res;
        
    }
}