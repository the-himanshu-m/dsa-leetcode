class Solution {
    public int countOperations(int num1, int num2) {
        return helper(num1, num2, 0);
    }

    private int helper(int num1, int num2, int count) {
        if (num1 == 0 || num2 == 0)
            return count;

        return (num1 >= num2) ? helper(num1 - num2, num2, count + 1) : helper(num1, num2 - num1, count + 1);
    }
}