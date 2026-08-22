class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        long product = 1;
        int num = n;
        
        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }

        return num % (sum + (int)product) == 0;
    }
}