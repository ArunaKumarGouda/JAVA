// Write a program to find greatest among three numbers.

import java.util.Scanner;

public class Aru_45_Greatest_Among_3_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a: ");
        int a = sc.nextInt();

        System.out.println("Enter number b: ");
        int b = sc.nextInt();

        System.out.println("Enter number c: ");
        int c = sc.nextInt();

        if ((a > b) & (a > c)) {
            System.out.println("a is greatest");
        }
        else if (b > c) {
            System.out.println("b is greatest");
        }
        else {
            System.out.println("c is greatest");
        }
        sc.close();
    }
}
