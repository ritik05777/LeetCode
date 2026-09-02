class Pair{
    double first;
    int  second;
    Pair(double  f,int s){
        first=f;
        second=s;
    }
}
class Solution {
    public double[] distance(int [][] points,int m){
        double [] dist=new double[m];
      for(int i=0;i<m;i++){
        double x=points[i][0];
        double y=points[i][1];
        double d=Math.sqrt((x*x)+(y*y));
        dist[i]=d;
      }
      return dist;
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair>pq=new PriorityQueue<>(
            (a,b)->Double.compare(b.first, a.first)
        );
        int m=points.length;
        double[]dist=distance(points,m);
        for(int i=0;i<m;i++){
            Pair p=new Pair(dist[i],i);
            if(pq.size()<k){
                pq.add(p);
                continue;
            }
            Pair p1=pq.peek();
            if(p1.first<=dist[i]){
               continue;
            }
            pq.poll();
            pq.add(p);
        }
        ArrayList<int[]>list=new ArrayList<>();
        while(!pq.isEmpty()){
            Pair p2=pq.poll();
            list.add(points[p2.second]);
        }
        int[][] result = list.toArray(new int[list.size()][]);
        return result;

        
    }
}