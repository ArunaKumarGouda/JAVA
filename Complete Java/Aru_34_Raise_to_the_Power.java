// Give 2 number a and b. Find a raise to the power b.

import java.util.Scanner;
public class Aru_34_Raise_to_the_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int a = sc.nextInt();

        System.out.println("Enter number 2: ");
        int b = sc.nextInt();

        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println("The number " + a + " raise to the power " + b + " is: " + ans);

        sc.close();
    }
}


