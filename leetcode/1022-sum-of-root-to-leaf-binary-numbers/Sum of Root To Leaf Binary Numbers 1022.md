# Problem
https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/

You are given the `root` of a binary tree where each node has a value `0` or `1`. Each root-to-leaf path represents a binary number starting with the most significant bit.

-   For example, if the path is `0 -> 1 -> 1 -> 0 -> 1`, then this could represent `01101` in binary, which is `13`.

For all leaves in the tree, consider the numbers represented by the path from the root to that leaf. Return _the sum of these numbers_.

The test cases are generated so that the answer fits in a **32-bits** integer.

**Example 1:**
![](https://assets.leetcode.com/uploads/2019/04/04/sum-of-root-to-leaf-binary-numbers.png)

**Input:** root = [1,0,1,0,1,0,1]
**Output:** 22
**Explanation:** (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22

**Example 2:**
**Input:** root = [0]
**Output:** 0

**Constraints:**
-   The number of nodes in the tree is in the range `[1, 1000]`.
-   `Node.val` is `0` or `1`.

# Solution
This approach recurses through each node, bitshifting the current value to left at each layer and adding to it the value of the current node. The final value is then summed at each leaf.
