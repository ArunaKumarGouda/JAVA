// Write a Program to evaluate equation of a straightline Y = mx + c.

import java.util.Scanner;
public class Aru_38_Equation_of_a_Straightline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of m: ");
        float m = sc.nextFloat();

        System.out.println("Enter the value of x: ");
        float x = sc.nextFloat();

        System.out.println("Enter the value of c: ");
        float c = sc.nextFloat();

        System.out.println("m =" + m + ", x =" + x + ", c =" + c);

        float Y = m * x + c;

        System.out.println("The value of Y is: " + Y);

        sc.close();
    }
}
