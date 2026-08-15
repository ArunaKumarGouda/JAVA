// Count the number of digits of a given number n.

import java.util.Scanner;
public class Aru_29_Count_Number_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int numberOfDigits = 0;
        int original_Digits_n = n;

        while(n > 0) {
            n = n / 10;
            numberOfDigits++;
        }
        System.out.println("The number of digits of " + original_Digits_n + " is : " + numberOfDigits);

        sc.close();
    }
}
