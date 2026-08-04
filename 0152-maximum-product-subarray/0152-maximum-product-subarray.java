class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];

        int minProduct = nums[0];
        int maxProduct = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int num = nums[i];
            //securing old values
            int prevMin = minProduct;
            int prevMax = maxProduct;

            //computing new values for maximum and minimum
            minProduct = Math.min(num, Math.min(num * prevMin, num * prevMax));
            maxProduct = Math.max(num, Math.max(num * prevMin, num * prevMax));

            //computing the max possible
            ans = Math.max(ans, maxProduct);
        }

        return ans;
    }
}