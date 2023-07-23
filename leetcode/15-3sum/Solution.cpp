/*
 * @lc app=leetcode id=15 lang=cpp
 *
 * [15] 3 Sum
 */
// @lc code=start

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int n = nums.size();
        set<vector<int>> ans;
        if(n < 3) return vector<vector<int>>();
        sort(nums.begin(), nums.end());

        for(int i = 0; i < n-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1, 
                r = n-1;

            while(l < r ){
                int sum = nums[i] + nums[l] + nums[r];

                if(sum > 0){
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    ans.insert(vector<int>{nums[i], nums[l], nums[r]});
                    l++;
                    while(l < r && nums[l] == nums[l-1])
                        l++;
                }
            }
        }
        
        return vector<vector<int>>(ans.begin(),ans.end());
    }
};
// @lc code=end
