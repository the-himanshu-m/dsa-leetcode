class Solution {
    public int romanToInt(String s) {
        int num = 0, size = s.length();

        for (int i = 0; i < size; i++) {
            if (i < size - 1 && value(s.charAt(i)) < value(s.charAt(i + 1))) {
                num -= value(s.charAt(i));
            } else {
                num += value(s.charAt(i));
            }
        }

        return num;
    }

    private int value(char c) {
        if(c == 'I') return 1;
        if(c == 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;
        return 1000;
    }
}