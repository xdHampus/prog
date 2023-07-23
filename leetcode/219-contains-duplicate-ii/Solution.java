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