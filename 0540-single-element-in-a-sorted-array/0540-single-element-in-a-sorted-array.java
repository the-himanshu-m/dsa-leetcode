class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;
            mid = (mid % 2 == 0) ? mid : mid - 1;

            if (nums[mid] != nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 2;
            }
        }

        return nums[start];
    }
}