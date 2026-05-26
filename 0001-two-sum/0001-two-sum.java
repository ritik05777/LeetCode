class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int index=0;
        int i=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for( i=0;i<n;i++){
            index=target-nums[i];
            //Math.abs(index);
            if(map.containsKey(index)==true){
                break;
            }
            else{
                map.put(nums[i],i);
            }
            

        }
        int j=map.get(index);
        int arr[]={i,j};
        return arr;
    }
}