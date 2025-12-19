import java.util.Scanner;

public class CalculateReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int b = sc.nextInt();

        // int c = a % b;
        // System.out.println("The reminder of " + a + " and " + b + " is : " + c);

        int c = a / b;
        int d = c * b;
        int e = a - d;
        System.out.println("The reminder of " + a + " and " + b + " is : " + e);

        sc.close();
    }
}