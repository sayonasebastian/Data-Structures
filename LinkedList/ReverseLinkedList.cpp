// 206 Reverse Linked List
#include <iostream>  
#include <string>
#include <vector>
#include <cfloat>
using namespace std;  

  struct ListNode {
     int val;
     ListNode *next;
     ListNode() : val(0), next(nullptr) {}
     ListNode(int x) : val(x), next(nullptr) {}
     ListNode(int x, ListNode *next) : val(x), next(next) {}
 };

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
         ListNode *cur=head;
           while(cur!=NULL && cur->next!=NULL){
               ListNode *temp = cur->next;
               cur->next= temp->next;
               temp->next= head;
               head=temp;
           }
            return head;
    }
};