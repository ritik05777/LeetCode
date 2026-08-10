class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0;
        int n=arr.length;
        int high=n-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[mid+1]){
                high=mid;
            }if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }
        }
        return high;
    }
}