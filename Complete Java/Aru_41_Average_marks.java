// Write a program to find average marks of 6 subjects (each subject is 100 marks).

import java.util.Scanner;
public class Aru_41_Average_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter mark1: ");
        float a = sc.nextFloat();

        System.out.println("Enter mark2: ");
        float b = sc.nextFloat();

        System.out.println("Enter mark3: ");
        float c = sc.nextFloat();

        System.out.println("Enter mark4: ");
        float d = sc.nextFloat();

        System.out.println("Enter mark5: ");
        float e = sc.nextFloat();

        System.out.println("Enter mark6: ");
        float f = sc.nextFloat();

        if (a > 100 || b > 100 || c > 100 || d > 100 || e > 100 || f > 100 || a < 0 || b < 0 || c < 0 || d < 0 || e < 0 || f < 0) {
            System.out.println("You entered an invalid marks, please enter correct marks (0 - 100).");
        }
        else {
            float average = (a + b + c + d + e + f) / 6;
            System.out.println("The average marks of all subjects is: " + average);
        }
        sc.close();
    }
}
