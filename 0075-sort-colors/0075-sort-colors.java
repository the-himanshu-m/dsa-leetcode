class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 2) {
                swap (nums, mid, high);
                high--;
            } else if (nums[mid] == 0) {
                swap (nums, mid, low);
                mid++;
                low++;
            } else {
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