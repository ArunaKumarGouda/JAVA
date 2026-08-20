// Write a program to Swap two numbers

import java.util.Scanner;
public class Aru_37_Swap_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int a = sc.nextInt();

        System.out.println("Enter number 2: ");
        int b = sc.nextInt();

        System.out.println("Before swapping: ");
        System.out.println("a = " + a + ", b = " + b);

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: ");
        System.out.println("a = " + a + ", b = " + b);

        sc.close();
    }
}
