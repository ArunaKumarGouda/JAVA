// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

public class Aru_118_Reverse_Integer {
    static int reverse(int x) {
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            // Check positive overflow
            if (reverse > Integer.MAX_VALUE / 10 ||
                    (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Check negative overflow
            if (reverse < Integer.MIN_VALUE / 10 ||
                    (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reverse = reverse * 10 + digit;
        }

        return reverse;
    }

    public static void main(String[] args) {
        int number = 901000;
        int ans = reverse(number);
        System.out.println(ans);
    }
}
