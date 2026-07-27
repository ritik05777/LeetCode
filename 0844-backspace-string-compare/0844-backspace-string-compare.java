class Solution {
    public String answer(String s){
        Stack<Character>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(! st.empty()){
                    st.pop();
                    continue;
                }else{
                    continue;
                }
            }
            st.push(s.charAt(i));
        }
        while(! st.empty()){
            char ch=st.peek();
            st.pop();
            sb.append(ch);
        }
        return sb.toString();
    }
    public boolean backspaceCompare(String s, String t) {
       return  answer(s).equals(answer(t));
    }
}