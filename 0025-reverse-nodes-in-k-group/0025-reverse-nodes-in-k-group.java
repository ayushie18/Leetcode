class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        int len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int times=len/k;
        curr=head;
        ListNode dummy=new ListNode(-1);
        ListNode p1=dummy;
      

        for(int i=0;i<times;i++){
            ListNode prev=null;
            ListNode p2=curr;
            int counter=0;
            while(counter<k){
                counter++;
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                
            }
            p1.next=prev;
            p2.next=curr;
            p1=p2;

        }
        return dummy.next;
        
    }
}