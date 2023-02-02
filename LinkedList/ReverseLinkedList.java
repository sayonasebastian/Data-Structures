package LinkedList;
// 206 Reverse Linked List
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
           while(cur!=null && cur.next!=null){
               ListNode temp = cur.next;
               cur.next= temp.next;
               temp.next= head;
               head=temp;
           }
            return head;
       }
}
