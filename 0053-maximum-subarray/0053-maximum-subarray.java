class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;

        for (int num : nums) {
            currSum = Math.max(currSum + num, num);
            max = Math.max(max, currSum);
        }

        return max;
    }
}