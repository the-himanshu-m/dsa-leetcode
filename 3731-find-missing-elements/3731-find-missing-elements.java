class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
        List<Integer> numsList = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            smallest = Math.min(smallest, num);
            largest = Math.max(largest, num);
        }

        for (int num : nums) {
            numsList.add(num);
        }

        while (smallest <= largest) {
            if (!numsList.contains(smallest)) {
                ans.add(smallest);
            }

            smallest++;
        }

        return ans;
    }
}