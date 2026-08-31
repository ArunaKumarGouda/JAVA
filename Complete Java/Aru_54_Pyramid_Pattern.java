import java.util.Scanner;

public class Aru_54_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row: ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++) {     // traversing over rows
            // print i - 1 spaces
            for(int j = i; j <= row - 1; j++) {
                System.out.print("  ");
            }

            // print 2 * i - 1 stars
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
