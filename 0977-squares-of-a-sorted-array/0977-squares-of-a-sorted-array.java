class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int n=nums.length;
        int[] ans=new int [n];
        int right=n-1;
        int i=0;
       while(left<=right){
         int x=Math.abs(nums[left]);
        int y=Math.abs(nums[right]);
        if(x>=y){
          ans[n-i-1]=x*x;
          left++;
          i++;
        }else{
            ans[n-i-1]=y*y;
            right--;
            i++;
        }
      

       }
       return ans;
    }
}