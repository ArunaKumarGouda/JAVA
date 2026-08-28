// Write a program to find the real root of a quadratic equation.

import java.util.Scanner;

public class Aru_47_Quadratic_Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Enter c: ");
        int c = sc.nextInt();

        double d = Math.pow(b, 2) - 4 * a * c;

        double r1;
        double r2;

        if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Two distinct real roots are: ");
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        }
        else if(d == 0) {
            r1 = -b / (2.0 * a);
            System.out.println("Both roots are equal.");
            System.out.println("Root = " + r1);
        }
        else {
            System.out.println("The roots are imaginary (complex).");
        }

        sc.close();
    }
}
