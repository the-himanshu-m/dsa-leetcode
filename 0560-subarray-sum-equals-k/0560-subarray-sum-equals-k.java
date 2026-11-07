class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0;
        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;

            if (map.containsKey(currentSum - k)) {
                ans += map.get(currentSum - k);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return ans;
    }
}