# Problem
https://leetcode.com/problems/squares-of-a-sorted-array/

Given an integer array `nums` sorted in **non-decreasing** order, return _an array of **the squares of each number** sorted in non-decreasing order_.

**Example 1:**
**Input:** nums = [-4,-1,0,3,10]
**Output:** [0,1,9,16,100]
**Explanation:** After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

**Example 2:**
**Input:** nums = [-7,-3,2,3,11]
**Output:** [4,9,9,49,121]

**Constraints:**
-   `1 <= nums.length <= 104`
-   `-104 <= nums[i] <= 104`
-   `nums` is sorted in **non-decreasing** order.

**Follow up:** Squaring each element and sorting the new array is very trivial, could you find an `O(n)` solution using a different approach?

# Solution

## Intuition

-   All squared numbers are positive
-   The array is sorted in an ascending order so the absolute largest numbers are situated in both ends of array [-127, -12, 0, 1, 250]

## Approach

Used a Left & Right pointer to keep track of the progress in both ends of the array, squared and inserted along the way.

-   [-127, -12, 0, 1, 250] L0 R4[0,0,0,0,0]
-   [-127, -12, 0, 1] L0 R3 [0,0,0,0,X]
-   [-12, 0, 1] L1 R3 [0,0,0,X,X]
-   [0, 1] L2 R3 [0,0,X,X,X]

## Complexity

-   Time complexity: O(n)
-   Space complexity: O(n)
