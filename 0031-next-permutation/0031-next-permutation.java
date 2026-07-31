class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1, start = nums.length - 1;;

        while (start > 0) {
            if (nums[start] > nums[start - 1]) {
                pivot = start - 1;
                break;
            }
            start--;
        }

        if (pivot == -1) {
            reverse(nums, 0);
            return;
        }

        start = nums.length - 1;

        while (start > pivot) {
            if (nums[start] > nums[pivot]) {
                swap (nums, start, pivot);
                break;
            }

            start--;
        }

        reverse (nums, pivot + 1);
    }

    private void swap (int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    private void reverse (int[] nums, int start) {
        int end = nums.length - 1;

        while (start < end) {
            swap (nums, start, end);
            start++;
            end--;
        }
    }
}