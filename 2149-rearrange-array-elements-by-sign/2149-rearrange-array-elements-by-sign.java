class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n=nums.length;
       int new_nums[]=new int[n];
       int positive=0;
       int negative=positive+1;
       for(int i=0;i<n;i++){
        if(nums[i]>0){
            new_nums[positive]=nums[i];
            positive+=2;
        }
        else if(nums[i]<0){
            new_nums[negative]=nums[i];
            negative+=2;
        }
      

    }
     return new_nums;
    }
}