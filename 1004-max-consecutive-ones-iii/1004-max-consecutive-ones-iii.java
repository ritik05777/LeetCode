class Solution {
    public int frequency(int[] freq){
        int max=-1;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
            }
           
        }
         return max;
    }
    public int longestOnes(int[] nums, int k) {
        int[]freq=new int[2];
        int n=nums.length;
        int res=Integer.MIN_VALUE;
        int high=0;
        int low=0;
        for(high=0;high<n;high++){
            freq[nums[high]]++;
            while(freq[0]>k){
                freq[nums[low]]--;
                low++;
            }
            int len=high-low+1;
            res=Math.max(len,res);
        }
        return res;

    }
     
} 