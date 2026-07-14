class Solution {
    public int ssum(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            n=n/10;
            sum+=d*d;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow=ssum(slow);
            fast=ssum(fast);
            fast=ssum(fast);
            if(slow==fast && slow!=1){
                return false;
            }
        }
        return true;
    }
}