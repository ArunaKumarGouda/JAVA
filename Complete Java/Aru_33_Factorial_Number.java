// Print the first n factorial number.

import java.util.Scanner;
public class Aru_33_Factorial_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.println("Factorial of " + i + " is: " + factorial);
        }
        sc.close();
    }
}
