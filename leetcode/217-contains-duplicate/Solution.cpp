/*
 * @lc app=leetcode id=217 lang=cpp
 *
 * [217] Contains Duplicate
 */
// @lc code=start
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
// @lc code=end
