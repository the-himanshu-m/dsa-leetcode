class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];

        int positive = 0, negative = 1, i = 0;
        while (i < nums.length) {
            if (nums[i] > 0) {
                ans[positive] = nums[i];
                positive += 2;
            } else {
                ans[negative] = nums[i];
                negative += 2;
            }

            i++;
        }

        return ans;
    }
}