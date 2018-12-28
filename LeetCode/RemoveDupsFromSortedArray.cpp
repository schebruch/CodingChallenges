using namespace std;
class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int nonDupIdx = 0;
        int dupIdx = 1;
        while(nonDupIdx + 1< nums.size()){
            if(nums.at(dupIdx) == nums.at(nonDupIdx)){
                nums.erase(nums.begin()+ dupIdx);
            }
            else{
                nonDupIdx = dupIdx;
                dupIdx++;

            }
        }
        return nums.size();
    }
};