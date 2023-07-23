class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int tL = nums1.length + nums2.length;
        if(tL==1) return nums1.length == 1 ? nums1[0] : nums2[0];
        int mI = (tL-2) / 2;
        int[] tA = new int[mI+2];
        int i = 0; int j = 0; int k = 0;
        while(k <= mI+1){
            if(i < nums1.length && (j >= nums2.length || nums1[i] <= nums2[j]) ){
                tA[k] = nums1[i];
                i++;
            } else if(j < nums2.length) {
                tA[k] = nums2[j];
                j++;
            }
            k++;
        }
        return tL % 2 == 1 ? tA[mI+1] : ((double)tA[mI] + (double)tA[mI + 1])/2;
    }
}