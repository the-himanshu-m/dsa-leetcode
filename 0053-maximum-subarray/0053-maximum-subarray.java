class Solution {
    public int maxSubArray(int[] nums) {
        int maximum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(nums[i], nums[i] + sum);
            maximum = Math.max(sum, maximum);
        }

        return maximum;
    }
}