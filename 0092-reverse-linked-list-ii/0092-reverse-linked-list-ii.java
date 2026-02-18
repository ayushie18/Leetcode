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
        if(head==null||head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode p=dummy;
        ListNode c=head;
        int counter=0;
        while(counter<left-1){
          p=c;
          c=c.next;
          counter++;
        }
     ListNode prev=null;
     ListNode curr=c;
     counter=0;
     while(counter<right-left+1){
        counter++;
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
     }
     p.next=prev;
     c.next=curr;

        
 return dummy.next;
        
    }
}