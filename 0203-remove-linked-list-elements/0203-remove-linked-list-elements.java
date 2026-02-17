class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp= head;
        ListNode t=temp;
        while(head!=null && head.val==val){
            head=head.next;
        }
        while(temp!=null){
            if(temp.val==val){
                t.next=temp.next;
            }
            else{
                t=temp;
            }
            temp=temp.next;
            
         }
        return head;
        
    }
}