class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int n=temperatures.length;
       Stack<Integer>st=new Stack<>();
       int ans[]=new int[n];
       st.push(n-1);
       ans[n-1]=0;
       for(int i=n-2;i>=0;i--){
        while(! st.empty() && temperatures[st.peek()]<=temperatures[i]){ 
            st.pop();
        }
        if(st.empty()){
            ans[i]=0;
        }else{ 
          ans[i]=(st.peek()-i);
        }
        st.push(i);
       }
       return ans;
    }
}