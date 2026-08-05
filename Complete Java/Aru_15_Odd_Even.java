// The if statement is a decision-making statement used to execute a block of code only when a specified condition is true.

import java.util.Scanner;

public class Aru_15_Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
        sc.close();
    }
}

