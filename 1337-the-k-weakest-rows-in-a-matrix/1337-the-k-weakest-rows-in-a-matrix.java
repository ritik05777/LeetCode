class Pair{
    int first;
    int second;
    Pair(int f,int s){
        first=f;
        second=s;
    }
}
class Solution {
    public int[] count(int [][] mat,int n,int m){
        int[] count1=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    count++;
                }count1[i]=count;
                if(mat[i][j]==0){
                    break;
                }

            }
        }
        return count1;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair>pq=new PriorityQueue<>(
            (a,b)->{
                if(a.first!=b.first){
                    return b.first-a.first;
                }
                return b.second-a.second;
            }
        );
        int n=mat.length;
        int m=mat[0].length;
        int []ans1=count(mat,n,m);
        for(int i=0;i<n;i++){
            //for(int j=0;j<m;j++){
                Pair p=new Pair(ans1[i],i);
                if(pq.size()<k){
                    pq.add(p);
                    continue;
                }
                Pair p1=pq.peek();
                if(p1.first<ans1[i]|| (p1.first==ans1[i] && p1.second<i)){
                    continue;
                }
                pq.poll();
                pq.add(p);
            //}
        }
        int[] res=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            Pair p2=pq.poll();
            res[i]=p2.second;
            i++;
        } 
        
         int left = 0;
int right = res.length - 1;

while (left < right) {
    int temp = res[left];
    res[left] = res[right];
    res[right] = temp;

    left++;
    right--;
}

return res;
        
    }
}