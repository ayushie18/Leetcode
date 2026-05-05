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
        if(head==null || k==0) return head;
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }

        k=k%len;

       // if(head==null || k==0) return head;
        
        
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;

        int remainingNodes=len-k;
        int i=0;
        temp=head;
        while(i<remainingNodes-1){
            temp=temp.next;
            i++;

        }
        head=temp.next;
        temp.next=null;

        return head;

        
    }
}