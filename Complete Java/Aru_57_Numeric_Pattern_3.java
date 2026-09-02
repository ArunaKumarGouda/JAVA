import java.util.Scanner;

public class Aru_57_Numeric_Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row: ");
        int row = sc.nextInt();

        System.out.println("Enter column: ");
        int column = sc.nextInt();

        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= column; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print(1);
                }
                else {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
