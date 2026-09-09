class Solution {
    public int maxProduct(int[] nums) {
        int largest = Integer.MIN_VALUE, secLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num >= largest) {
                secLargest = largest;
                largest = num;
            } else if (num > secLargest) {
                secLargest = num;
            }
        }

        return (largest - 1) * (secLargest - 1);
    }
}