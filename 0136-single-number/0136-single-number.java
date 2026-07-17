class Solution {
    public int singleNumber(int[] nums) {
        int singleNumber = nums[0];
        for (int num = 1; num < nums.length; num++) {
            singleNumber = singleNumber ^ nums[num];
        }
        return singleNumber;
    }
}