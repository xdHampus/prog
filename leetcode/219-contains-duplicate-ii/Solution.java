/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */
// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> ints = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(ints.containsKey(nums[i])){
                if(Math.abs(i - ints.get(nums[i])) <= k){
                    return true;
                }
            }
            ints.put(nums[i],i);
        }
        return false;
    }
}
// @lc code=end

