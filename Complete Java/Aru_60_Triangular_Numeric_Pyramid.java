import java.util.Scanner;

public class Aru_60_Triangular_Numeric_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row: ");
        int row = sc.nextInt();

        System.out.println("Enter column: ");
        int column = sc.nextInt();

        for(int i = 1; i <= row; i++) {
            for(int j = i; j <= row - 1; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= 2 * i - 1; k++) {
                if(k == 1 || k == 2 * i - 1 || i == row) {
                    System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
