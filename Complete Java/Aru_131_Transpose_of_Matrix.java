// Write a program to display transpose of matrix entered by the user.e

import java.util.Scanner;

public class Aru_131_Transpose_of_Matrix {
    static void printArray(int[][] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transposeMatrix(int[][] arr, int r, int c) {

        int[][] ans = new int[c][r];

        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];
            }
        }

        return ans;
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
        int[][] ans = transposeMatrix(arr, r, c);
        printArray(ans);

        sc.close();
    }
}
