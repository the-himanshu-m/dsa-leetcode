class Solution {
    public int firstMissingPositive(int[] nums) {

        sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) return i + 1;
        }

        return nums.length + 1;
    }

    private void sort (int[] nums) {
        int start = 0;

        while (start < nums.length) {
            int correct = nums[start] - 1;

            if (nums[start] > 0 && nums[start] < nums.length + 1 && nums[start] != nums[correct]) {
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