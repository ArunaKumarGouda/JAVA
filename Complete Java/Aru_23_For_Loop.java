// The for loop is an entry-controlled loop used to execute a block of code repeatedly for a specified number of time.
// Print the sum of the first n natural numbers, where n is the input.

import java.util.Scanner;

public class Aru_23_For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int sum = 0;

        for (int num = 1; num <= n; num++) {
            sum += num;
        }
        System.out.println("The sum of 1 to " + n + " is : " +sum);

        sc.close();
    }
}
