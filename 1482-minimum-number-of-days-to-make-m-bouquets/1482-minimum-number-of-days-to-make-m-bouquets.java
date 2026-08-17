class Solution {
    public boolean possible(int[] bloomDay,int m,int k,int day){
        int counter=0;
        int ND=0;
         for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                counter++;
            }if(bloomDay[i]>day){
                ND+=counter/k;
                counter=0;
            }
         }
         ND+=counter/k;
         if(ND>=m){
            return true;
         }
         return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
         int high=Integer.MIN_VALUE;
         int low=Integer.MAX_VALUE;
         int n=bloomDay.length;
         if(((long)m*k)>n){
            return -1;
         }
         for(int i=0;i<n;i++){
            if(bloomDay[i]>high){
                high=bloomDay[i];
            }
         }
            for(int i=0;i<n;i++){
                if(bloomDay[i]<low){
                    low=bloomDay[i];
                }
            }
            int ans=-1;
            while(low<=high){
                int day=(low+high)/2;
                if(possible(bloomDay,m,k,day)==true){
                    ans=day;
                    high=day-1;
                }else{
                    low=day+1;
                }
            }
            return ans;
         }
    }
