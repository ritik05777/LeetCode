class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map1=new HashMap<>();
         HashMap<Character,Integer>map2=new HashMap<>();
         for(int i=0;i<ransomNote.length();i++){
            map1.put(ransomNote.charAt(i),map1.getOrDefault(ransomNote.charAt(i),0)+1);
         }
         for(int i=0;i<magazine.length();i++){
             map2.put(magazine.charAt(i),map2.getOrDefault(magazine.charAt(i),0)+1);
         }
              return  compare(map1,map2);
          

    }
    public boolean compare(HashMap<Character,Integer> map1, HashMap<Character,Integer> map2) {

    for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
        char c = entry.getKey();
        int fNeed = entry.getValue();
        int fHave = map2.getOrDefault(c, 0);

        if (fHave < fNeed) {
            return false;
        }
    }
    return true;
}
    
 }
