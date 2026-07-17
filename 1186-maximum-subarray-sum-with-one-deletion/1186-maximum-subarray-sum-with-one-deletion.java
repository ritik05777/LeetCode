class Solution {
    public int maximumSum(int[] arr) {
        int onedel=0;
        int nodel=arr[0];
        int res=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            int prevnodel=nodel;
            nodel=Math.max(arr[i],arr[i]+nodel);
            onedel=Math.max(prevnodel,onedel+arr[i]);
            res=Math.max(res,Math.max(nodel,onedel));
        }
        return res;
    }
}