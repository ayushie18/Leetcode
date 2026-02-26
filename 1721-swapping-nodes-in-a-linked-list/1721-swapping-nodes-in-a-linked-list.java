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
    public ListNode kthfromstart(ListNode head,int n){
        ListNode temp=head;
        for(int i=1;i<n;i++){
            if(temp==null) return null;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode kthfromEnd(ListNode head, int n){
        ListNode slow=head;
        ListNode fast=head;
        for(int i=1;i<=n;i++){
           if(fast==null) return null;
            fast=fast.next;

        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;

            
        }
        return slow;
    }
    public ListNode swapNodes(ListNode head, int k) {

       ListNode t1=kthfromstart( head, k);
       ListNode t2=kthfromEnd( head, k);
       int t=t1.val;
       t1.val=t2.val;
       t2.val=t;
       
       return head;

        
    }
}