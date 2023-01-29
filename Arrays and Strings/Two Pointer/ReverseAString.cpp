// 344. Reverse String
#include <iostream>  
#include <string>
#include <vector>
#include <cfloat>
using namespace std;  

class Solution {
public:
    void reverseString(vector<char>& s) {
        for (int i=0, j = s.size() -1; i<j;i++, j--)
        {
            char t = s.at(i);
            s.at(i) = s.at(j);
            s.at(j) = t;
            
        }
    }
};