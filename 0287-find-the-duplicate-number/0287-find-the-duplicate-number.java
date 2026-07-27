class Solution {
    public int findDuplicate(int[] nums) {
        sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) return nums[i];
        }

        return -1;
    }

    private void sort (int[] nums) {
        int start = 0;

        while (start < nums.length) {
            int correct = nums[start] - 1;

            if (nums[correct] != nums[start] && nums[start] <= nums.length) {
                swap (nums, start, correct);
            } else {
                start++;
            }
        }
    }

    private void swap (int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}