
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len=0;
        ListNode curr=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int uniformdist=len/k;
        int rem=len%k;
         curr=head;
        ListNode[] res= new ListNode[k];
        for(int i=0;i<k;i++){
           int count=uniformdist;
           if(rem>0){
            count+=1;
            rem=rem-1;
           }
            int j=0;
            ListNode prev=null;
            ListNode temp=curr;
           while(j<count){
             prev=curr;
             curr=curr.next;
             j++;
           }
           if(prev!=null) prev.next=null;

           res[i]=temp;
        } 

      return res;  
    }
}