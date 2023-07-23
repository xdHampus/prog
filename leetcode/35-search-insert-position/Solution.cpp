class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int l = 0;
        int r = nums.size()-1;
        int i = 0;
        while(l<=r){
            i = l + (abs(l-r) >> 1);
            if(nums[i] == target){
                break;
            }
            else if(nums[i] < target){
                l = i+1;
            } else {
                r = i-1;
            }
        }


        return nums[i] < target ? i+1 : i;
    }
};