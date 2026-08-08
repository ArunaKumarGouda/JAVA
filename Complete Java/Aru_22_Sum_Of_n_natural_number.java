// Print the sum of n natural numbers, where n is the input.

import java.util.Scanner;

public class Aru_22_Sum_Of_n_natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int sum = 0;
        int num = 1;
        while (num <= n) {
            sum += num;
            num++;
        }
        System.out.println("The sum of 1 to " + n + " is : " + sum);

        sc.close();
    }
}
