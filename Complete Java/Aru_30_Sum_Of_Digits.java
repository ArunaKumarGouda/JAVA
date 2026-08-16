import java.util.Scanner;

public class Aru_30_Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        int sumOfNumber = 0;
        int original_n = n;

        while (n > 0) {
            sumOfNumber += n % 10;
            n = n / 10;
        }
        System.out.println("The sum of all the digit " + original_n + " is " + sumOfNumber);

        sc.close();
    }
}
