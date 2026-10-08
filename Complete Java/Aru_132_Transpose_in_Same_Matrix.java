import java.util.Scanner;

public class Aru_132_Transpose_in_Same_Matrix {
    static void printArray(int[][] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeInSameMatrix(int[][] arr, int r, int c) {
        for(int i = 0; i < c; i++) {
            for(int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter " + r * c + " elements: ");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix is: ");
        printArray(arr);

        System.out.println("transpose matrix is: ");
        transposeInSameMatrix(arr, r, c);
        printArray(arr);

        sc.close();
    }
}
