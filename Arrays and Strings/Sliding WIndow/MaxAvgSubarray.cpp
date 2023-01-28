//643. Maximum Average Subarray I

#include <iostream>  
#include <string>
#include <vector>
#include <cfloat>
using namespace std;  

class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int l =0, r= 0;
        double  sum =0;
        double max= -DBL_MAX;;
        while(r<nums.size()){
            sum = sum+ nums.at(r);
            if(r-l+1 == k){
                max = max > (sum/k) ? max : sum/k;
                sum = sum - nums.at(l);
                l++;
            }
            r++;
        }
        return max;
        
    }
};
