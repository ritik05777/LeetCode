class Pair{
    int first;
    int second;
    Pair(int f ,int s){
        first=f;
        second=s;
    }
}
class Solution {
    // public int [] close(int [] arr,int x,int n){
    //     int [] ans =new int[n];
    //     for(int i=0;i<n;i++){
    //         ans[i]=Math.abs(arr[i]-x);
    //     }
    //     return ans;
    // }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair>pq=new PriorityQueue<>(
            (a,b)->{
                if(a.first!=b.first){
                    return b.first-a.first;
                }
                return a.second-b.second;
            }
        );
        int n=arr.length;
        //int [] abs=close(arr,x,n);
        for(int i=0;i<n;i++){
         
            Pair p=new Pair(Math.abs(arr[i]-x),arr[i]);
            if(pq.size()<k){
                pq.add(p);
                continue;
            }
            Pair p1=pq.peek();
            if(p1.first<=Math.abs(arr[i]-x)){
                continue;
            }
            pq.poll();
            pq.add(p);
        }
        ArrayList<Integer>list=new ArrayList<>();
        while(!pq.isEmpty()){
            Pair p2=pq.poll();
            list.add(p2.second);
        }
        Collections.sort(list);
        return list;
    }
}