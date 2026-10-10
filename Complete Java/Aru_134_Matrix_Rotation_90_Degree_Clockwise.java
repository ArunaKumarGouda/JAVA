// Given a square matrix, turn it by 90 degrees in a clockwise direction without using any extra space.

import java.util.Scanner;

public class Aru_134_Matrix_Rotation_90_Degree_Clockwise {
    static void printMatrix(int[][] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void reverseArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void transposeMatrix(int[][] arr, int r, int c) {
        for(int i = 0; i < c; i++) {
            for(int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void rotateMatrix(int[][] arr, int r) {
        int n = arr.length;

        transposeMatrix(arr, r, r);

        for(int i = 0; i < n; i++) {
            reverseArray(arr[i]);
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
        printMatrix(arr);

        System.out.println("Rotated Matrix is: ");
        rotateMatrix(arr, r);
        printMatrix(arr);
    }
}
