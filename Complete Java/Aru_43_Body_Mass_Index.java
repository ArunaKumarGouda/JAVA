// Write a program to calculate Body Mass Index (BMI).

import java.util.Scanner;

public class Aru_43_Body_Mass_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight (kg): ");
        float weight = sc.nextFloat();

        System.out.println("Enter your height (m): ");
        float height = sc.nextFloat();

        double BMI = weight / (height * height);

        System.out.println("Your body mass index is: " + BMI);

        sc.close();
    }
}
