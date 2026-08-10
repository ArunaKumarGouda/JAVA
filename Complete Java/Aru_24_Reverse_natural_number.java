import java.util.Scanner;

public class Aru_24_Reverse_natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number (0 - 9): ");
        int n = sc.nextInt();

        for (int num = 10; num >= n; num--) {
            System.out.println(num);
        }
        sc.close();
    }
}
