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
    public ListNode reverseLL(ListNode head){
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
    public int pairSum(ListNode head) {
        // ArrayList<Integer> list=new ArrayList<>();
        // while(head!=null){
        //     list.add(head.val);
        //     head=head.next;
        // }

        // int max=Integer.MIN_VALUE;
        // int i=0;
        // int j=list.size()-1;
        
        // while(i<j){
        //    int sum=list.get(i)+list.get(j);
        //    max=Math.max(sum,max);
        //    i++;
        //    j--;

            
        // }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=reverseLL(slow);
        int max=Integer.MIN_VALUE;
        while(temp!=null){
            int sum=head.val+temp.val;
            max=Math.max(sum,max);
            temp=temp.next;
            head=head.next;
        }

        return max;
        
    }
}