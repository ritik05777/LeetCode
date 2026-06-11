class Solution {
    public void setZeroes(int[][] matrix) {
        int i=0;
        int j=0;
        int m=matrix.length;
        int n=matrix[0].length;
        boolean [] row=new boolean[m];
        boolean [] col=new boolean[n];
        for( i=0;i<m;i++){
            for( j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(row[i] || col[j]){
                 matrix[i][j]=0;
                
            }

        }
     }

    }
}