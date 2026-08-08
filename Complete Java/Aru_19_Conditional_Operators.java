// Write a program to print the value if it is even and divisible by 3.

import java.util.Scanner;

public class Aru_19_Conditional_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Found ans : " + num);
            System.out.println(num + " is even and also divisible by 3.");
        }
        else {
            System.out.println("Not found");
        }
        sc.close();
    }
}
