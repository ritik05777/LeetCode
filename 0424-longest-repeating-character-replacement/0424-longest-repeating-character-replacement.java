 class Solution {
    public int frequency(int freq[]){
        int max=-1;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
            }

        }
        return max;
    }
    public int characterReplacement(String s, int k) {
        int[] freq=new int[256];
        int low=0;
        int high=0;
        int res=Integer.MIN_VALUE;
        int n=s.length();
        for(high=0;high<n;high++){
            int ch=s.charAt(high);
            freq[ch]++;
            int len=high-low+1;
            int maxcount=frequency(freq);
            int diff=len-maxcount;
            while(diff>k){
                char ch2=s.charAt(low);
                freq[ch2]--;
                low++;
                len=high-low+1;
                maxcount=frequency(freq);
                diff=len-maxcount;
            }
             
                len=high-low+1;
                res=Math.max(res,len);
            

        }
        return res;
    }

}