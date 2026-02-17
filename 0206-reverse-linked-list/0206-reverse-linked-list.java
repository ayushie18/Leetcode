class Solution {
    public ListNode reverseList(ListNode head) {
    //  ListNode temp=head;//USING STACK
    //  Stack <Integer> st=new Stack<>();
    //  while(temp!=null){
    //    st.push(temp.val);
    //    temp=temp.next;
    //  }
    //  temp=head;
    //  while(temp!=null){
    //     temp.val=st.pop();
    //     temp=temp.next;
    //  }
    //  return head;
    if(head==null || head.next==null){
        return head;
    }
    int len=0;
    ListNode l=head;
    while(l!=null){
        l=l.next;
        len++;
    }
    ListNode [] arr= new ListNode[len];
    l=head;
    int i=len-1;
    while(l!=null){
        arr[i]=l;
        l=l.next;
        i--;
    }
    for(int j=0;j<len-1;j++){
        arr[j].next=arr[j+1];

    }
    arr[len-1].next=null;

    
    return arr[0];
  
    }
}