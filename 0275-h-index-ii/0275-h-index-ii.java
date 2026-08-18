class Solution {
    public boolean check(int [] citations ,int guess){
        int n=citations.length;
        int counter=0;
        for(int i=0;i<n;i++){
            if(citations[i]>=guess){
                counter++;
            }else{
                continue;
            }
        }
        if(counter>=guess){
            return true;
        }
        return false;
    }
    public int hIndex(int[] citations) {
        int low=0;
        int n=citations.length;
        int high =n;
        int ans =0;
        while(low<=high){
            int mid=(low+high)/2;
            if(check(citations,mid)==true){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}