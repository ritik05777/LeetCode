class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int n=numbers.length;
       int left=0;
       int right=n-1;
       while(left<right){
        int sum=numbers[left]+numbers[right];
        if(target==sum){
           break;
        }
      else if(sum<target){
            left++;
        }
        else{
            right--;
        }

       }
       int[] ans={left+1,right+1};
       return ans;
        
    }
}