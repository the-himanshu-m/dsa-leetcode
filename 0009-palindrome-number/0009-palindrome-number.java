class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == reverse(x)) return true;

        return false;
    }

    private int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            rev = (x < 10) ? rev + rem : (rev + rem) * 10;

            x /= 10;
        }

        return rev;
    }
}