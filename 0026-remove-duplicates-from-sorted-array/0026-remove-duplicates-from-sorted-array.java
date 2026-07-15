class Solution {
    public int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int write = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[write] = arr[i];
                write++;
            }
        }
            return write;
    }
}