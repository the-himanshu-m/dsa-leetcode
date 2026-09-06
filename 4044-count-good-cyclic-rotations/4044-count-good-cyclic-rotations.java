class Solution {
    public int countGoodRotations(int[] nums) {
        long sum = 0, tempSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length/2) {
                tempSum += nums[i];
            }
            sum += nums[i];
        }

        if (tempSum > sum - tempSum) count++;
        
        int start = 0, end = nums.length/2;
        for (int i = 0; i < nums.length - 1; i++) {
            tempSum = tempSum + nums[end] - nums[start];
            if (tempSum > sum - tempSum) count++;
            
            start = (start + 1) % nums.length;
            end = (end + 1) % nums.length;
        }
        return count;
    }
}