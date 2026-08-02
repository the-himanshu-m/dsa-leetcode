class Solution {
    public int majorityElement(int[] nums) {
        int vote = 1;
        int candidate = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                vote++;
            } else {
                vote--;
            }

            if (vote == 0) {
                vote = 1;
                candidate = nums[i];
            }
        }

        return candidate;
    }
}