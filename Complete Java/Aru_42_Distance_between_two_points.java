// Write a program to find the distance between two points.

import java.util.Scanner;

public class Aru_42_Distance_between_two_points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x1: ");
        float x1 = sc.nextFloat();

        System.out.println("Enter the value of y1: ");
        float y1 = sc.nextFloat();

        System.out.println("Enter the value of x2: ");
        float x2 = sc.nextFloat();

        System.out.println("Enter the value of y2: ");
        float y2 = sc.nextFloat();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between two points is: " + distance);
    }
}
