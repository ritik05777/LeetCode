class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int n=numbers.length;
        int index1=0;
        int index2=0;
        int right=n-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
             else if(sum==target){
                index1=left+1;
                index2=right+1;
                break;
             }
            
        }
         int [] ans={index1,index2};
             return ans ;
    }
}