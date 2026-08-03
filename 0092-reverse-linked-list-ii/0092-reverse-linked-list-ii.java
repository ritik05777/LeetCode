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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null){
            return null;
        }
        if(left==right){
            return head;
        }
        int pos=1;
        ListNode t=head;
        ListNode before=null;
        while(t!=null){
        if(pos<left){
            before=t;
            t=t.next;
            pos++;
            continue;
        }
        ListNode curr=t;
        ListNode prev=null;
        int times=right-left+1;
        for(int i=0;i<times;i++){
            ListNode nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
            t.next=curr;
            if(before ==null){
                return prev;
            }
              before.next=prev;
            return head;
        }
        return head;

        
    }
}