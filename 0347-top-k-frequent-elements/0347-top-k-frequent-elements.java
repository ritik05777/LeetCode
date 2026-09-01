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
                    return b.first-a.first;
                }
                return b.second-a.second;
            }
        );
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            Pair p1=new Pair(entry.getValue(),entry.getKey());
                pq.add(p1);
                continue;
        }
        int []ans=new int[k];
        for(int i=0;i<k;i++){
            Pair x=pq.poll();
            ans[i]=x.second;
        }
        return ans;
    }
}