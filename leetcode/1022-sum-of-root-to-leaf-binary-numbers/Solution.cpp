/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
public:


    int subr(TreeNode* node, int cur){
        int sum = 0;
        int nxt = (cur << 1) + node->val;

        if(node->left != nullptr){
            sum += subr(node->left, nxt);
        }
        if(node->right != nullptr){
            sum += subr(node->right, nxt);
        } 
        if(node->left == nullptr && node->right == nullptr) {
            return sum + nxt;
        }
        return sum;
    }

    int sumRootToLeaf(TreeNode* root) {
        return subr(root, 0);
    }
};