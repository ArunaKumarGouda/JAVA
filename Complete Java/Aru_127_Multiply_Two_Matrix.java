// Write a program to display multiplication of two matrices entered by the user.

import java.util.Scanner;

public class Aru_127_Multiply_Two_Matrix {
    static void printArray(int[][] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplyMatrices(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if(c1 != r2) {
            System.out.println("Wrong input - multiplication is not possible.");
            return;
        }

        int[][] multiply = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    multiply[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }

        printArray(multiply);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows in matrix 1: ");
        int r1 = sc.nextInt();

        System.out.println("Enter number of columns in matrix 1: ");
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("Enter " + r1 * c1 + " elements: ");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows in matrix 2: ");
        int r2 = sc.nextInt();

        System.out.println("Enter number of columns in matrix 2: ");
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];

        System.out.println("Enter " + r2 * c2 + " elements: ");
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Multiplication of two matrices is: ");
        multiplyMatrices(a, r1, c1, b, r2, c2);

        sc.close();
    }
}
