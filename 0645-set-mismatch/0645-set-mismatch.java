class Solution {
    public int[] findErrorNums(int[] nums) {
        sort(nums);

        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans[0] = nums[i];
                ans[1] = i + 1;

                return ans;
            }
        }

        return ans;
    }

    private void sort (int[] nums) {
        int start = 0;

        while (start < nums.length) {
            int correct = nums[start] - 1;

            if (nums[correct] != nums[start]) {
                swap(nums, start, correct);
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