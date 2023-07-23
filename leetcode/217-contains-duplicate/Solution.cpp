class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        auto checkedNums = unordered_set<int>() ;
        for(int i : nums) {
            if (checkedNums.count(i) == 0)
            {
                checkedNums.insert(i);
            } else return true;
        }
        return false;
    }
};