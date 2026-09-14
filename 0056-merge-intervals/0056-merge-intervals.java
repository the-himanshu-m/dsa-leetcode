import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[][] merge(int[][] nums) {

        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> ans = new ArrayList<>();

        int first = nums[0][0], second = nums[0][1];
        for (int i = 1; i < nums.length; i++) {
            if (second >= nums[i][0]) {
                second = Math.max(second, nums[i][1]);
            } else {
                ans.add(new int[] {first, second});
                first = nums[i][0];
                second = nums[i][1];
            }
        }

        ans.add(new int[] {first, second});

        return ans.toArray(new int[ans.size()][]);
    }
} 