class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0;
        int n=nums.length;
        int closestsum=nums[0]+nums[1]+nums[2];
        for( i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                int diff1=Math.abs(sum-target);
                int diff2=Math.abs(closestsum-target);
                if(diff1<diff2){
                    closestsum=sum;
                }
                if(sum<target){
                    left++;
                } else{
                    right--;
                }
                if(sum==target){
                    return target;
                }
                
            }

        }
        return closestsum;
        
    }
}