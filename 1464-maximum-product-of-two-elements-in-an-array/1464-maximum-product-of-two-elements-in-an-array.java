class Solution {
    public int maxProduct(int[] nums) {

        int largest = Integer.MIN_VALUE, sLargest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                sLargest = largest;
                largest = nums[i];
            } else if (nums[i] > sLargest) {
                sLargest = nums[i];
            }
        }

            return (largest - 1) * (sLargest - 1);
    }
}