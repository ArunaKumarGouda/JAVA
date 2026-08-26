// Write a program to check a number is positive, negative or zero.

import java.util.Scanner;

public class Aru_46_Check_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int a = sc.nextInt();

        if(a > 0) {
            System.out.println("Number is positive");
        }
        else if (a < 0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }
        sc.close();
    }
}
