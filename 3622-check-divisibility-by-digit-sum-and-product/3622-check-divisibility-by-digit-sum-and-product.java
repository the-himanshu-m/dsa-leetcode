class Solution {
    public boolean checkDivisibility(int n) {
        return n % digitCal(n) == 0;
    }

    private int digitCal (int n) {
        if (n < 10) return 2 * n;
        int sum = 0;
        long product = 1;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }

        return sum + (int)product;
    }
}