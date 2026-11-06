class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int candidate1 = nums[0];
        int candidate2 = nums[0];
        int count1 = 0;
        int count2 = 0;
        int threshold = nums.length/3;

        for (int num : nums) {
            if (count1 == 0 && num != candidate2) {
                count1 = 1;
                candidate1 = num;
            } else if (count2 == 0 && num != candidate1) {
                count2 = 1;
                candidate2 = num;
            } else if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        int verified1 = 0;
        int verified2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                verified1++; 
            } else if (num == candidate2) {
                verified2++;
            }
        }

        if (verified1 > threshold) {
            ans.add(candidate1);
        }

        if (verified2 > threshold) {
            ans.add(candidate2);
        }

        return ans;
    }
}