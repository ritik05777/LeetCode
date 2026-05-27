class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                positive.add(nums[i]);
            }else if(nums[i]<0){
                negative.add(nums[i]);
            }
        }
        for(int i=0;i<n/2;i++){
            nums[2*i]=positive.get(i);
            nums[2*i+1]=negative.get(i);
        }
        return nums;
    }
}