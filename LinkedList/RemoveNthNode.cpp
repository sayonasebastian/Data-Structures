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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode *p = head, *q=head;
        int c=0,i=0;
        while(p != NULL){
            p= p->next;
            c++;
        }
         if(c==n)
       head = head->next; else{
        while(i<c-n-1){
            q=q->next;
            i++;
        }
        if(q!=NULL && q->next!=NULL){
            q->next = q->next->next;
        }

       }

       cout<<c;
        return head;
    }
};