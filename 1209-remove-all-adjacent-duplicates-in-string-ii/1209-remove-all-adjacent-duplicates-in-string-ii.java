class Pair{
    char ch;
    int freq;
    Pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        Stack<Pair>st=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
             if(st.empty()){
                st.push(new Pair(c,1));
                continue;
             }if(st.peek().ch !=c){
                st.push(new Pair(c,1));
                continue;
             }else{
                 st.peek().freq++;
                  if (st.peek().freq == k) {
                    st.pop();
                }
             }
              
        }
        while(! st.empty()){
           Pair p=st.pop();
           while(p.freq>0){
           sb.append(p.ch);
           p.freq--;
           }
        }
        return sb.reverse().toString();
    }
}