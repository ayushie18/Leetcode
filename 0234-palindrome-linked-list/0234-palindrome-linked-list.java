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
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
       if(head.next==null) return true;
       ListNode newHead= new ListNode(head.val);
       ListNode t1=head.next;
       ListNode t2=newHead;
       while(t1!=null){
        ListNode temp=new ListNode(t1.val);
        t2.next=temp;
        t2=t2.next;
        t1=t1.next;
       }

        newHead=reverse(newHead);
        t1=head;
        t2=newHead;
       while(t1!=null){
        if(t1.val!=t2.val) return false;
            t1=t1.next;
            t2=t2.next;
        
       }
       return true;
    }
}