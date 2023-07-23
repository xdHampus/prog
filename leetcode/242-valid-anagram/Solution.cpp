/*
 * @lc app=leetcode id=242 lang=cpp
 *
 * [242] Valid Anagram
 */
// @lc code=start
class Solution {
public:
    bool isAnagram(string s, string t) {
        size_t strlen = s.length();
        if(strlen != t.length()) return false;

        auto seenChars = unordered_map<char,int>();
        for (size_t i = 0; i < strlen; i++)
        {
            seenChars[s[i]] += 1;
        }
        
        for (size_t i = 0; i < strlen; i++)
        {
            if(seenChars[t[i]] < 1) return false;
            seenChars[t[i]] -= 1;
        }
        

        return true;
    }
};
// @lc code=end
