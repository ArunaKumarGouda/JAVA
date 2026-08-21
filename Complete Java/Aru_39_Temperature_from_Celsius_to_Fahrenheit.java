// Write a program to convert Temperature from Celsius to Fahrenheit.

import java.util.Scanner;

public class Aru_39_Temperature_from_Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature in Celsius: ");
        float C = sc.nextFloat();

        float F = 9f / 5f * C + 32;

        System.out.println(C + " degree Celsius is: " + F + " Fahrenheit");

        sc.close();
    }
}
