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
    public ListNode swapNodes(ListNode head, int k) {
        int len=0;
        int jumps=k-1;
        
        ListNode temp=head;
        while(temp!=null){
            len=len+1;
            temp=temp.next;
        }

        ListNode n1=head;
        
        int counter=0;
        while(counter<jumps){
            counter++;
            n1=n1.next;
        }
        ListNode n2=head;
        counter=0;
        int jumps2=len-k;
        while(counter<jumps2){
            counter++;
            n2=n2.next;
        }

        int t=n1.val;
        n1.val=n2.val;
        n2.val=t;


  return head;
        
    }
}