class Solution {
    public int missingNumber(int[] nums) {
        sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) return i;
        }

        return nums.length;
    }

    private void sort(int[] nums) {
        int start = 0;
        while (start < nums.length) {
            int correct = nums[start];
            if (correct != nums.length && nums[correct] != nums[start]) {
                int temp = nums[start];
                nums[start] = nums[correct];
                nums[temp] = temp;
            } else {
                start++;
            }
        }
    }
}