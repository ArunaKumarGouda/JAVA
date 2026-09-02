import java.util.Scanner;

public class Aru_59_Numerical_Pyramid_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row: ");
        int row = sc.nextInt();

        System.out.println("Enter column: ");
        int column = sc.nextInt();

        for(int i = 1; i <= row; i++) {     // Traversing over rows
            // print row - 1 spaces
            for(int j = i; j <= row - 1; j++) {
                System.out.print(" ");
            }

            // print 1 to i numbers
            for(int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // print i - 1 to 1 numbers
            for(int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
        sc.close();
    }
}
