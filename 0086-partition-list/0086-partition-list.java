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
    public ListNode partition(ListNode head, int x) {
        
     ListNode dummy1=new ListNode(-1);
     ListNode dummy2=new ListNode(-1);
     ListNode temp1=dummy1;
     ListNode temp2=dummy2;
     ListNode temp=head;

     while(temp!=null){
        if(temp.val<x){
          temp1.next=temp;
          temp1=temp1.next;
          temp=temp.next;
        }
        else{
            temp2.next=temp;
            temp2=temp2.next;
            temp=temp.next;
        }
     }

     temp2.next=null;
     dummy1=dummy1.next;
     dummy2=dummy2.next;
     if(dummy1==null) return dummy2;
     temp1.next=dummy2;
     return dummy1;
}
}