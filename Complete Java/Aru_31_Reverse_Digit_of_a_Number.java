// Reverse the digit of a number.

import java.util.Scanner;

public class Aru_31_Reverse_Digit_of_a_Number {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int reverse = 0;
        int ans = 0;
        int original_n = n;

        while (n > 0) {
            reverse = ans * 10 + n % 10;
            ans = reverse;
            n = n / 10;
        }
        System.out.println("The reverse of " + original_n + " is " + reverse);

//        int ans = 0;
//
//        while (n > 0) {
//            ans = ans * 10 + n % 10;
//            n = n / 10;
//        }
//        System.out.println(ans);

        sc.close();
    }
}
