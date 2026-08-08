// A while loop is an entry-controlled loop that repeatedly executes a block of code as long as the specified condition is true.
// Print n natural numbers, where n is the input.

import java.util.Scanner;
public class Aru_21_While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();

        System.out.print("The sum of 1 to " + n + " is : ");
        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num++;
        }
        sc.close();
    }
}
