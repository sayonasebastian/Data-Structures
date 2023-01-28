package LinkedList;
//876 Middle of the Linked List
public class MiddleListNode {
    public ListNode middleNode(ListNode head) {
        ListNode p=head,q=head;
       while(p!= null && q!= null){
          if(p.next == null)
             break;
           else{
               p=p.next.next;
               q=q.next;
           }
       }
       return q;
   }
}
