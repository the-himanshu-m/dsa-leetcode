class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = Integer.MIN_VALUE;
        int minProduct = 1, maxProduct = 1;

        for (int num : nums) {
            int tempMax = maxProduct;
            maxProduct = Math.max(Math.max(maxProduct * num, minProduct * num), num);
            minProduct = Math.min(Math.min(tempMax * num, minProduct * num), num);

            max = Math.max(max, maxProduct);
        }

        return max;
    }
}