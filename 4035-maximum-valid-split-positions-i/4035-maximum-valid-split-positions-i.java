class Solution {
    public int maxValidSplits(int[] nums) {
        int ans = 0;
        int n = nums.length;

        for (int remove = -1; remove < n; remove++) {
            int m = remove == -1 ? n : n - 1;
            int[] arr = new int[m];

            int index = 0;
            for (int i = 0; i < n; i++) {
                if (i != remove) {
                    arr[index++] = nums[i];
                }
            }

            int[] rightGCD = new int[m];
            rightGCD[m - 1] = arr[m - 1];

            for (int i = m - 2; i >= 0; i--) {
                rightGCD[i] = gcd(arr[i], rightGCD[i + 1]);
            }

            int leftGCD = arr[0];
            int count = 0;

            for (int i = 0; i < m - 1; i++) {
                if (leftGCD == rightGCD[i + 1]) {
                    count++;
                }

                leftGCD = gcd(leftGCD, arr[i + 1]);
            }

            ans = Math.max(ans, count);
        }

        return ans;
    }

    private int gcd(int x, int y) {
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }

        return x;
    }
}