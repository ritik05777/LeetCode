class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high =(m*n)-1;
        int row=0;
        int col=0;
        while(low<=high){
            int mid=(low+high)/2;
            row=mid/m;
            col=mid%m;
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;

    }
}