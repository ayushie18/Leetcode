class Solution {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo < hi) {

            int mid = lo + (hi - lo) / 2;

            // Minimum is in right half
            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            }

            // Minimum is in left half including mid
            else if (nums[mid] < nums[hi]) {
                hi = mid;
            }

            // Cannot decide because duplicates
            else {
                hi--;
            }
        }

        return nums[lo];
        
    }
}