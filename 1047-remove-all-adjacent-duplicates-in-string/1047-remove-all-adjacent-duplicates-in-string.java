class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(! st.empty()){
            if(st.peek()!=s.charAt(i)){
                st.push(s.charAt(i));

            }else{
                st.pop();
            }
            }else{
                st.push(s.charAt(i));
            }
        }
        while(! st.empty()){
            char ch=st.peek();
            st.pop();
            sb.append(ch);
        }
        sb.reverse();
        return sb.toString();
    }
}