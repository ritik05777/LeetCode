class Solution {
    public int count(int [][] a,int guess,int n,int m){
        int row=n-1;
        int col=0;
        int counter=0;
        while(row>=0 && col<m){
            if(a[row][col]<=guess){
                counter+=row+1;
                col++;
            }else{
                row--;
            }
        }
        return counter;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=matrix[0][0];
        int high=matrix[n-1][m-1];
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(count(matrix,mid,n,m)<k){
                low=mid+1;
            }else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
         
    }
    
}