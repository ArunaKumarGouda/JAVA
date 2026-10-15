// Given a positive integer n, generate an n X n matrix filled with elements from 1 to n^2 in spiral order.

import java.util.Scanner;

public class Aru_139_Generate_Spiral_Matrix {
    static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int topRow = 0, bottomRow = n - 1, leftColumn = 0, rightColumn = n - 1;
        int current = 1;
        
        while(current <= n * n) {
            // topRow -> leftColumn to rightColumn
            for(int j = leftColumn; j <= rightColumn && current <= n * n; j++) {
                matrix[topRow][j] = current;
                current++;
            }
            topRow++;

            // rightColumn -> topRow to bottomRow
            for(int i = topRow; i <= bottomRow && current <= n * n; i++) {
                matrix[i][rightColumn] = current;
                current++;
            }
            rightColumn--;

            // bottomRow -> rightColumn to leftColumn
            for(int k = rightColumn; k >= leftColumn && current <= n * n; k--) {
                matrix[bottomRow][k] = current;
                current++;
            }
            bottomRow--;

            // leftColumn -> bottomRow to topRow
            for(int l = bottomRow; l >= topRow && current <= n * n; l--) {
                matrix[l][leftColumn] = current++;
            }
            leftColumn++;
        }
        return matrix;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int[][] matrix = generateSpiralMatrix(n);
        printMatrix(matrix);
        sc.close();
    }
}
