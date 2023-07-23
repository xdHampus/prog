/*
 * @lc app=leetcode id=705 lang=cpp
 *
 * [705] Binary Search
 */
// @lc code=start
class Solution {
public:
    int search(vector<int>& nums, int target) {
        
        int l = 0;
        int r = nums.size()-1;
        int ans = -1;
        while(l<=r){
            int i = l + (abs(l-r) >> 1);
            if(nums[i] == target){
                ans = i;
                break;
            }
            else if(nums[i] < target){
                l = i+1;
            } else {
                r = i-1;
            }
        }

        return ans;
    }
};
// @lc code=end
