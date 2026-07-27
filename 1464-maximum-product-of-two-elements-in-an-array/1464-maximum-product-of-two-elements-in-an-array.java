class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

        int largest = 0, sLargest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[largest]) {
                sLargest = largest;
                largest = i;
            }
            
            if (nums[i] > nums[sLargest] && i != largest) {
                sLargest = i;
            }

            if (largest == sLargest && sLargest == 0) sLargest++;
        }

            return (nums[largest] - 1) * (nums[sLargest] - 1);
    }
}