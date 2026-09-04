class Solution {
    public int reverse(int x) {
        if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) return 0;

        long rev = 0;
        int nums = x;
        while (x != 0) {
            int rem = x % 10;
            x /= 10; 
            rev = (rev * 10) + rem;
        }

        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) return 0;

        return (int)rev;
    }
}