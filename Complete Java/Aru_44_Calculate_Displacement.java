// write a program to calculate displacement

import java.util.Scanner;

public class Aru_44_Calculate_Displacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial velocity (m/s): ");
        float u = sc.nextFloat();

        System.out.println("Enter acceleration (m/s*s): ");
        float a = sc.nextFloat();

        System.out.println("Enter time (s): ");
        float t = sc.nextFloat();

        double s = u * t + 0.5 * a * Math.pow(t, 2);

        System.out.println("The final displacement is: " + s + "m");

        sc.close();
    }
}
