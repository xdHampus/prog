/*
 * @lc app=leetcode id=3 lang=cpp
 *
 * [3] Longest Substring Without Repeating Characters
 */
// @lc code=start

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.length(), m = 0, i = 0, l = 0;
        unordered_set<char> c;
        while(i < n){
            if(!c.count(s[i])){
                c.insert(s[i]);
                m = c.size() > m ? c.size() : m;
                i++;
            } else {
                c.erase(s[l]);
                l++;
            }
        }
        return m;
    }
};
// @lc code=end
