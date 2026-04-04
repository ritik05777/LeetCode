class Solution {
    public boolean check(int[] nums) {
        int drop=0;
        int n=nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=nums[i-1]){ 
                
            }
            
            if(nums[i]<nums[i-1]){
                drop++;
            }

        }
        if((nums[0]>=nums[n-1])&& (drop==0|| drop==1 )){
            return true;
        }
        else if(drop==0) {
            return true;
        }
       
        else{
            return false;
        }
        
        

        
        
    }
   
}