package LinkedList;
// 21 Merge Two Sorted Lists
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = null, newlistIT=null;
        while(list1!= null && list2!= null){
            if(list1.val < list2.val){
                if(newList == null){
                    newlistIT = list1;
                    newList = newlistIT;
                    list1= list1.next;
                } else{
                    newlistIT.next = list1;
                    list1= list1.next;
                    newlistIT = newlistIT.next;
                }
            } else {
                if(newList == null){
                    newlistIT = list2;
                    list2= list2.next;
                    newList = newlistIT;
                } else{
                    newlistIT.next = list2;
                    list2= list2.next;
                    newlistIT = newlistIT.next;
                }
            }
        }
        if(list1!=null){
            if(newList == null){
                newList = list1;
            }
            else {
                newlistIT.next = list1;
            }
        }
         if(list2!=null){
            if(newList == null){
                newList = list2;
            }
            else {
                newlistIT.next = list2;
            }
        }
         return newList;
    } 
}
