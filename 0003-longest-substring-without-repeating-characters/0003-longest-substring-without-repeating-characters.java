class Solution {
    public int lengthOfLongestSubstring(String s) {
        int high=0;
        int low=0;
        int n=s.length();
        int res=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(high=0;high<n;high++){
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char leftchar=s.charAt(low);
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0){
                    map.remove(leftchar);
                }
                low++;
            }
            int len=high-low+1;
            res=Math.max(len,res);
            


        }
        return res;
        
    }
}