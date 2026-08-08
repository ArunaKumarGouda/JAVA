// The switch statement is the decision-making statement used to execute one block of code from multiple choice based on the value of an expression.

import java.util.Scanner;

public class Aru_20_Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day : ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
        sc.close();
    }
}
