// Nested if-else is an if-else statement placed inside another if or else statement to check multiple condition one after another.

import java.util.Scanner;

public class Aru_17_Nested_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age : ");
        int age = sc.nextInt();

        if (age <= 18) {
            if (age < 12) {
                System.out.println("Child");
            }
            else {
                System.out.println("Teenager");
            }
        }
        else {
            System.out.println("Adult");
        }
        sc.close();
    }
}
