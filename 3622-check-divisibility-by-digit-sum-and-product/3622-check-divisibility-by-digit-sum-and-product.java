class Solution {
    public boolean checkDivisibility(int n) {
        return n % (digitSum(n) + digitProduct(n)) == 0;
    }

    private int digitSum (int n) {
        if (n < 10) return n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }

        return sum;
    }

    private int digitProduct (int n) {
        if (n < 10) return n;
        long product = 1;

        while (n != 0) {
            int rem = n % 10;
            product *= rem;
            n /= 10;
        }

        return (int)product;
    }
}