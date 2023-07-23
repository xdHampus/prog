/*
 * @lc app=leetcode id=977 lang=cpp
 *
 * [977] Last Stone Weight
 */
// @lc code=start
class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n = nums.size(), l = 0, r = nums.size()-1;
        vector<int> out(n);
        int k = r;
        while(l<=r && k >= 0){
            int i = l;
            if(abs(nums[l]) > abs(nums[r])){
                l++;
            } else {
                i = r;
                r--;
            }
            out[k] = nums[i] * nums[i];
            k--;
        }

        return out;
    }
};
// @lc code=end
