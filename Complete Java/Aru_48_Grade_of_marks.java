// Write a program to find grade of a student in a subject of max mark 100.

import java.util.Scanner;

public class Aru_48_Grade_of_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mark in your subject: ");
        int mark = sc.nextInt();

        if (mark > 100 || mark < 0) {
            System.out.println("You entered an invalid mark. Please re-enter a correct mark.");
        }
        else if (mark >= 90) {
            System.out.println("O Grade");
        }
        else if (mark >= 80) {
            System.out.println("E Grade");
        }
        else if (mark >= 70) {
            System.out.println("A Grade");
        }
        else if (mark >= 60) {
            System.out.println("B Grade");
        }
        else if (mark >= 50) {
            System.out.println("C Grade");
        }
        else if (mark >= 40) {
            System.out.println("D Grade");
        }
        else {
            System.out.println("Fail (F) Grade, Try again next year");
        }

        sc.close();
    }
}
