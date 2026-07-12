class Solution {
    public int frequency(int freq[]){
        int max=-1;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
            }
        }
        return max;
    }
    public int longestSubarray(int[] nums) {
        int high=0;
        int low=0;
        int n=nums.length;
        int res=Integer.MIN_VALUE;
        int[] freq=new int[2];
        for(high=0;high<n;high++){
            freq[nums[high]]++;
            int len=high-low+1;
            int maxcount=frequency(freq);
            int diff=len-maxcount;
            while(freq[0]>1){
                freq[nums[low]]--;
                low++;
                len=high-low+1;
                maxcount=frequency(freq);
                diff=len-maxcount;
            }
            len=(high-low+1)-1;
            res=Math.max(res,len);
        }
        return res;
        
    }
}