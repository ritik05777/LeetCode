class pair{
    int el;
    int row;
    int col;
    pair(int e,int r,int c){
        el=e;
        row=r;
        col=c;
    }
}
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<pair>pq=new PriorityQueue<>(
            (a,b) -> a.el-b.el
        );
        int n=matrix.length;
        int m=matrix[0].length;
        for(int row=0;row<n;row++){
            pq.add(new pair(matrix[row][0],row,0));
        }
        int counter=0;
        while(!pq.isEmpty()){
            pair p=pq.poll();
            counter++;
            if(counter==k){
                return p.el;
            }
            if(p.col+1<m){
                pq.add(new pair(matrix[p.row][p.col+1],p.row,p.col+1));
            }
        }
        return-1;
    }
}