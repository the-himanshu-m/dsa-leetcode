class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
 
        sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) ans.add(nums[i]);
        }

        return ans;
    }

    private void sort (int[] nums) {
        int start = 0;

        while (start < nums.length) {
            int correct = nums[start] - 1;

            if (nums[correct] != nums[start]) {
                swap (nums, start, correct);
            } else {
                start++;
            }
        }
    }

    private void swap (int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}