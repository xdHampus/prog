/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */
// @lc code=start

class Solution {
    
    public int[] twoSum(int[] nums, int target) {
    
        HashMap<Integer, Integer> subCalc = new HashMap<>();
        int[] o = new int[2];
        for(int i = 0; i < nums.length; i++){
            int m = target - nums[i];
            if(!subCalc.containsKey(target - nums[i]))
                subCalc.put(nums[i], i);
            else {
                o[0] = subCalc.get(target - nums[i]);
                o[1] = i;
            }
        }
        return o;
                
    }
}
// @lc code=end
