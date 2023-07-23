class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> output(n); 

        output[0] = 1;
        for(int i = 1; i < n; i++) {
            output[i] = output[i-1] * nums[i-1];
        }

        int post = nums[n-1];
        for(int i = n-2; -1 < i; i--) {
            output[i] *= post;
            post *= nums[i];
        }


        return output;
    }
};