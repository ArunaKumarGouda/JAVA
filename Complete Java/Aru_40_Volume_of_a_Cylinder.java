// Write a program to calculate volume of a cylinder.

import java.util.Scanner;

public class Aru_40_Volume_of_a_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of cylinder: ");
        float radius = sc.nextFloat();

        System.out.println("Enter height of cylinder: ");
        float height = sc.nextFloat();

        double volume = Math.PI * radius * radius * height;

        System.out.println("Radius = " + radius + "cm , height = " + height + "cm");
        System.out.println("The volume of cylinder is: " + volume);

        sc.close();
    }
}
