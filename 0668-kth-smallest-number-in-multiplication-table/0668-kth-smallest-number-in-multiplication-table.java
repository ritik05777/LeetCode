class Solution {
    public int counter(int m,int n,int guess){
        int counter=0;
        int row=1;
        while(row<=n){
            counter+=Math.min(m,(guess/row));
            row++;
        }
        return counter;
    }
    public int findKthNumber(int m, int n, int k) {
        int low=1;
        int high=n*m;
        while(low<=high){
            int mid=(low+high)/2;
            if(counter(m,n,mid)<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low ;
    }
}