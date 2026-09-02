class Pair{
    int first;
    int second;
    Pair(int f,int s){
        first=f;
        second=s;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         PriorityQueue<Pair>pq=new PriorityQueue<>(
            (a,b)->{
                if(a.first!=b.first){
                    return a.first-b.first;
                }
                return a.second-b.second;
            }
        );
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
       Pair p1= new Pair(entry.getValue(),entry.getKey());
       if(pq.size()<k){
       pq.add(p1);
       continue;
       }
       Pair p=pq.peek();
       if(p.first>entry.getValue()){
        continue;
       }
       pq.poll();
       pq.add(p1);
       
     } 
     int [] ans=new int [pq.size()];
     int i=0;
     while(!pq.isEmpty()){
        Pair x=pq.poll();
        ans[i]=x.second;
        i++;
     }
     return ans;
    }
}