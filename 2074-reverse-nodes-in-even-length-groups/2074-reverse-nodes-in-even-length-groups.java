class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode curr=head;
        int len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        curr=head;
        int probSize=1;
        ListNode p=null;
        while(curr!=null){
            int actualSize=Math.min(probSize,len);
              int counter=0;
            if(actualSize%2==0){
          
            ListNode prev=null;
            ListNode temp1=curr;
            while(counter<actualSize){
                counter++;
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            p.next=prev;
            temp1.next=curr;
            p=temp1;
            }
            else{
                counter=0;
                while(counter<actualSize){
                    counter++;
                    p=curr;
                    curr=curr.next;
                }
            }
            probSize++;
            len=len-actualSize;

        }
        return head;
    }
}