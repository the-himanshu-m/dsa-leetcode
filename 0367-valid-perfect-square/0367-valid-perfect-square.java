class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        int start = 1, end = num/2;

        while (start <= end) {
            int mid = start + (end - start)/2;
            long sqr = 1L * mid * mid;

            if (sqr == num) {
                return true;
            } else if (sqr < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}