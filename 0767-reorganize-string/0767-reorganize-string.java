class Pair{
    int first;
    char second;
    Pair(int f,char s){
        first=f;
        second=s;
    }
}
class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>(
            (a,b)->{
                if(a.first!=b.first){
                    return b.first-a.first;
                }
                return b.second-a.second;
            }
        );
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            char ch=entry.getKey();
            int f=entry.getValue();
            Pair p=new Pair(f,ch);
            pq.add(p);
        }
        StringBuilder res=new StringBuilder("");
        int seat=0;
        while(!pq.isEmpty()){
            Pair p2=pq.poll();
            // if(res.length()==0){
            //     res.append(p2.second);
            // }
            if(seat==0 || res.charAt(seat-1)!=p2.second){
                res.append(p2.second);
                seat++;
                p2.first--;
                if(p2.first>0){
                    pq.add(p2);
                }

            }else{
                if(pq.isEmpty()){
                    return "";
                }
                Pair p3=pq.poll();
                res.append(p3.second);
                seat++;
                p3.first--;
                if(p3.first>0){
                    pq.add(p3);
                }
                pq.add(p2);
            }
        }
        return res.toString();

    }

}