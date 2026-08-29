import java.util.Scanner;

public class Aru_51_Rectangular_Pattern_Border {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int row = sc.nextInt();

        System.out.println("Enter columns: ");
        int column = sc.nextInt();

        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= column; j++) {
                if(i == 1 || i == row || j == 1 || j == column) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
