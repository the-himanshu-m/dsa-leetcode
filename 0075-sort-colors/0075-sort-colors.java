class Solution {
    public void sortColors(int[] nums) {
        int start = 0, mid = 0, end = nums.length - 1;

        while (mid <= end) {
            if (nums[mid] == 2) {
                swap(nums, mid, end);
                end--;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, start);
                start++;
                mid++;
            }
        }
    }

    private void swap (int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}