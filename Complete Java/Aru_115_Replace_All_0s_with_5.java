public class Aru_115_Replace_All_0s_with_5 {
    static int convertFive(int n) {
        // code here

        if(n == 0) {
            return 5;
        }

        int ans = 0;
        int reverse = 0;
        int digit = 0;

        while(n > 0) {
            digit = n % 10;
            n /= 10;

            if(digit == 0) {
                digit += 5;
            }
            reverse = reverse * 10 + digit;
        }

        while(reverse > 0) {
            ans = ans * 10 + reverse % 10;
            reverse /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 124;
        int ans = convertFive(n);
        System.out.println(ans);
    }
}
