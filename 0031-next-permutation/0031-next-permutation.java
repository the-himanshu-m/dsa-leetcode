class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(nums, 0);
            return;
        }

        // int next = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[pivot]) {
                // next = i;
                swap(nums, i, pivot);
                break;
            }
        }

        reverse(nums, pivot + 1);
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