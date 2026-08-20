// Write a program to find area of a circle

import java.util.Scanner;
public class Aru_36_Area_of_a_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of a circle: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;
        System.out.println(area);

        sc.close();
    }
}
