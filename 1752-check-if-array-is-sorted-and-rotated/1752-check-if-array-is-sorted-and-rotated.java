class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        boolean ans=false;
        int[] b=Arrays.copyOf(nums,n);
        Arrays.sort(nums);
         int cnt=0;
         for(int x=0;x<n;x++){
            cnt=0;
            for(int i=0;i<n;i++){
                if(b[i]==nums[(i+x)%n]){
                    cnt++;
                     if(cnt==n){
                     ans=true;
        }
                    

                }
            }   
            
         }

        return ans;
    }
}