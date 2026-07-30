class Solution {
    public int[] plusOne(int[] nums) {
        ArrayList <Integer> list = new ArrayList<>();

        nums[nums.length - 1]++;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i + 1] > 9) {
                nums[i]++;
                nums[i + 1] %= 10;
            }
        }

        int count = 0;
        
        if (nums[0] > 9) {
            list.add(1);
            nums[0] %= 10;
        }

        while (count < nums.length) {
            list.add(nums[count]);
            count++;
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}