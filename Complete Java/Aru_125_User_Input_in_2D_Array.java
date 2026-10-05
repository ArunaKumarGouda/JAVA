import java.util.Scanner;

public class Aru_125_User_Input_in_2D_Array {
    static void printArray(int[][] arr) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        System.out.println("Enter " + row * column + " elements: ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        printArray(arr);
        sc.close();
    }
}
