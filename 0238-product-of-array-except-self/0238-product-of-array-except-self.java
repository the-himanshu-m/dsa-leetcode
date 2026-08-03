class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // 1. Initialize and calculate Left Product
        ans[0] = 1;
        for (int i = 1; i < n; i++) { 
            ans[i] = nums[i - 1] * ans[i - 1]; 
        }

        // 2. Initialize and calculate Right Product & Final Answer
        int rightProduct = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProduct *= nums[i + 1];
            ans[i] *= rightProduct;
        }

        return ans;
    }
}