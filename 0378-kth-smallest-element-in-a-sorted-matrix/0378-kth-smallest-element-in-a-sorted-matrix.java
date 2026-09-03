class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(pq.size()<k){
                pq.add(matrix[i][j]);
                continue;
                }
                if(pq.peek()<=matrix[i][j]){
                    continue;
                }
                pq.poll();
                pq.add(matrix[i][j]);
            }

        }
        return pq.peek();
    }
}