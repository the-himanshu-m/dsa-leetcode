class Solution {
    public void setZeroes(int[][] arr) {
        boolean firstColZero = false;
        for (int row = 0; row < arr.length; row++) {

            if (arr[row][0] == 0) {
                firstColZero = true;
            }

            for (int col = 1; col < arr[0].length; col++) {
                if (arr[row][col] == 0) {
                    arr[row][0] = 0;
                    arr[0][col] = 0;
                }
            }
        }

        for (int row = arr.length - 1; row >= 0; row--) {
            for (int col = arr[0].length - 1; col >= 1; col--) {
                if (arr[row][0] == 0 || arr[0][col] == 0) {
                    arr[row][col] = 0;
                }
            }

            if(firstColZero) {
                arr[row][0] = 0;
            }
        }
    }
}
