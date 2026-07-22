class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int counter0=0;
        int counter1=0;
        int res=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                counter0++;
            }else if(nums[i]==1){
                counter1++;
            }
            int diff=counter0-counter1;
            if(diff==0){
                res=Math.max(res,i+1);
            }
            if(map.containsKey(diff)){
                res=Math.max(res,(i-map.get(diff)));
            }else{
                map.put(diff,i);

            }
             

        }
        return res;
    }
}