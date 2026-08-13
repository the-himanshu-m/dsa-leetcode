class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (mid == end) return mid;
            if (mid == start) {
                return (nums[start] < nums[end]) ? end : start;
            }
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
            if (nums[mid + 1] > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return 0;
    }
}