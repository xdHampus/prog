# Problem
https://leetcode.com/problems/contains-duplicate/

Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

**Example 1:**
**Input:** nums = [1,2,3,1]
**Output:** true

**Example 2:**
**Input:** nums = [1,2,3,4]
**Output:** false

**Example 3:**
**Input:** nums = [1,1,1,3,3,4,3,2,4,2]
**Output:** true

**Constraints:**
-   `1 <= nums.length <= 105`
-   `-109 <= nums[i] <= 109`

# Solution
## Using lookup table
Loop over elements and check whether table contains number.
Time:  O(N), Space: O(N)

##  Nested loop (Slow)
Loop over numbers, for every number loop over the entire list again to see if one matches.
Time:  O(N²), Space: O(1)
