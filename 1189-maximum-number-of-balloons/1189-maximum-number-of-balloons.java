class Solution {
    public int maxNumberOfBalloons(String text) {
        String input="balloon";
        int counter=Integer.MAX_VALUE;
        HashMap<Character,Integer>need=new HashMap<>();
        HashMap<Character,Integer>have=new HashMap<>();
        for(int i=0;i<input.length();i++){
            need.put(input.charAt(i),need.getOrDefault(input.charAt(i),0)+1);
        }
        for(int i=0;i<text.length();i++){
            have.put(text.charAt(i),have.getOrDefault(text.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer>entry : need.entrySet()){
            char c=entry.getKey();
            int fneed=entry.getValue();
            int fhave=have.getOrDefault(c,0);
            int times=fhave/fneed;
            counter=Math.min(times,counter);
            
        }
        return counter; 
        
    }
}