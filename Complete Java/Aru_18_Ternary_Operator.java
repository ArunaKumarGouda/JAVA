// The ternary operator is a short form of the if-else statement. It checks condition and returns one of two values.

import java.util.Scanner;

public class Aru_18_Ternary_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();

        String result;
        result = (num % 2 == 0) ? "Number is even" : "Number is odd";
        System.out.println(result);

        sc.close();
    }
}
