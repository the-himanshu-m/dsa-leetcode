class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        int rightProduct = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightProduct *= nums[i + 1];
            answer[i] *= rightProduct;
        }

        return answer;
    }
}