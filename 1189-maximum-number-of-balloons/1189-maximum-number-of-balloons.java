class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
        int ans=Integer.MAX_VALUE;
        ans= Math.min(ans,map.getOrDefault('b',0));
        ans= Math.min(ans,map.getOrDefault('l',0)/2);
        ans= Math.min(ans,map.getOrDefault('o',0)/2);
        ans= Math.min(ans,map.getOrDefault('a',0));
        ans= Math.min(ans,map.getOrDefault('n',0));
        return ans;
    }
}