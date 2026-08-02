class Solution {
    public void moveZeroes(int[] nums) {
        int read = 0, write = 0;

        while (read < nums.length) {
            if (nums[read] != 0) {
                swap (nums, read, write);
                write++;
            }

            read++;
        }
    }

    private void swap (int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}