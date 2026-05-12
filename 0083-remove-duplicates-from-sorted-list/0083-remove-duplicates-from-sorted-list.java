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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode a= head;
        while(a!=null){
            ListNode b=a.next;
            while(b!=null && b.val==a.val){
                b=b.next;
            }
            a.next=b;
            a=b;
        }
    return head;    
    }
}