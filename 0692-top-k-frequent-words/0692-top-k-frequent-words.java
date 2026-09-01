class Pair{
    int first;
    String second;
    Pair(int f,String s){
        first=f;
        second=s;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Pair>pq=new PriorityQueue<>(
            (a,b)->{
                if(a.first!=b.first){
                    return a.first-b.first;
                }
                return b.second.compareTo(a.second);
            }
        );
            HashMap<String,Integer>map=new HashMap<>();
            for(int i=0;i<words.length;i++){
                map.put(words[i],map.getOrDefault(words[i],0)+1);
            }
            for(Map.Entry<String,Integer>entry:map.entrySet()){
                Pair p=new Pair(entry.getValue(),entry.getKey());
                if(pq.size()<k){
                    pq.add(p);
                    continue;
                }
                Pair p1=pq.peek();
                 if (p1.first > entry.getValue() ||(p1.first == entry.getValue() && p1.second.compareTo(entry.getKey()) < 0)) {
                 continue;
                }
                pq.poll();
                pq.add(p);
            }
            ArrayList<String>list=new ArrayList<>();
            while(! pq.isEmpty()){
                Pair p2=pq.poll();
                list.add(p2.second);
            }
            Collections.reverse(list);
            return list;
        
        
    }
}