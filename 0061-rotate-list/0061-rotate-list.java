/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        int n=1;
        ListNode temp=head;
        while(temp.next!=null){
            n++;
            temp=temp.next;
        }
        k=k%n;
        if(k==0){
            return head;
        }
        ListNode newl=head;
        for(int i=1;i<=n-k;i++){
            if(i==n-k){
                break;
            }
           newl=newl.next;
        }
        temp.next=head;
        ListNode res=newl.next;
        newl.next=null;

        return res;

        
    }
}