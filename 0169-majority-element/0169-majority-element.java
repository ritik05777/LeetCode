class Solution {
    public int majorityElement(int[] nums) {
        int counter=0;
        int el=0;
        for(int i=0;i<nums.length;i++){
            if(counter==0){
                counter=1;
                el=nums[i];
            }else if(nums[i]==el){
                counter++;
            }
            else{
                counter--;
            }
        }
        return el;
    }
}