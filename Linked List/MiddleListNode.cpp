//876 Middle of the Linked List
  struct ListNode {
     int val;
     ListNode *next;
     ListNode() : val(0), next(nullptr) {}
     ListNode(int x) : val(x), next(nullptr) {}
     ListNode(int x, ListNode *next) : val(x), next(next) {}
 };
 
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode *p=head,*q=head;
        while(p!=NULL && q!= NULL){
            if(p->next== NULL){
                break;
            } else{
                p=p->next->next;
                q=q->next;
            }
        }
        return q;
    }
};