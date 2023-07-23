/*
 * @lc app=leetcode id=191 lang=cpp
 *
 * [191] Number of 1 Bits
 */
// @lc code=start

class Solution {
public:
    int hammingWeight(uint32_t n) {
        uint8_t res = 0;
        for (size_t i = 0; i < 32; i++)
        {
            if(n % 2) res += 1;
            n = n >> 1;
        }
        return res;
    }
};
// @lc code=end
