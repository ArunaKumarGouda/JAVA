// Input in Java is a process of receiving data form the user or another source into a program for processing.

import java.util.Scanner;

public class Aru_04_Taking_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Enter your lucky number : ");
        int number = sc.nextInt();

        System.out.println("The name is : " + name);
        System.out.println("The lucky number is : " + number);

        sc.close();
    }
}
