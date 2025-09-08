class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (isValid(a) && isValid(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{}; // should never happen
    }

    private boolean isValid(int num) {
        while (num > 0) {
            if (num % 10 == 0) return false;  // contains zero
            num /= 10;
        }
        return true;
    }
}
