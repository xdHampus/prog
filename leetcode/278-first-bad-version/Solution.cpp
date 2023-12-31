/*
 * @lc app=leetcode id=278 lang=cpp
 *
 * [278] First Bad Version
 */
// @lc code=start
// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        while(l<r){
            int i = l + (abs(l-r)>>1);
            if(isBadVersion(i)){
                r = i;
            } else {
                l = i+1;
            }
        }
        return l;
    }
};
// @lc code=end
