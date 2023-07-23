/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */
// @lc code=start

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int val = numbers[l] + numbers[r];
            if(val < target) {
                l++;
            } else if(val > target){
                r--;
            } else {
                return new int[]{l+1, r+1};
            }
        }
        return null;
    }
}
// @lc code=end
