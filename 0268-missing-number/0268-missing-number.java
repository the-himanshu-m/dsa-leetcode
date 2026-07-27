class Solution {
    public int missingNumber(int[] nums) {
        sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) return i;
        }

        return nums.length;
    }

    private void sort(int[] nums) {
        int start = 0;
        while (start < nums.length) {
            int correct = nums[start];

            if (correct < nums.length && nums[correct] != nums[start]) {
                swap(nums, correct, start);
            } else {
                start++;
            }
        }
    }

    private void swap (int[] nums, int correct, int start) {
        int temp = nums[correct];
        nums[correct] = nums[start];
        nums[start] = temp;
    }
}