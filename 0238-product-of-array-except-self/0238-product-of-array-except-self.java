class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Variables initialization
        int n = nums.length;
        int[] ans = new int[n];
        int rightProduct = 1;

        ans[0] = 1;

        //Calculating leftProduct
        for (int i = 1; i < n; i++) {
            ans[i] = nums[i - 1] * ans[i - 1];
        }

        //Calculating rightProduct and answer
        for (int i = n - 2; i >= 0; i--) {
            rightProduct *= nums[i + 1];

            ans[i] *= rightProduct;
        }

        return ans;
    }
}