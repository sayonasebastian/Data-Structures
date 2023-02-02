//142. Linked List Cycle II

 function ListNode(val) {
    this.val = val;
    this.next = null;
 }
 

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
 var detectCycle = function(head) {
    
    var s= new Set();
    while(head!==null){
        if(!s.has(head)){
            s.add(head);
            head = head.next;
        } else return head;
    }
    return null;
};
