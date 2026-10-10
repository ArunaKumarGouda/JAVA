// Given an integer n, return the first n rows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
// For n = 5.
/*
            1
          1   1
         1  2  1
        1  3  3  1
       1  4  6  4 1
 */

import java.util.Scanner;

public class Aru_135_Pascals_Triangle {
    static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n) {
        int[][] ans = new int[n][];

        for(int i = 0; i < n; i++) {
            // ith row has i + 1 columns.
            ans[i] = new int[i + 1];

            // 1st and last elements of every row is 1.
            ans[i][0] = ans[i][i] = 1;

            for(int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int[][] ans = pascal(n);
        System.out.println("Pascal matrix is: ");
        printMatrix(ans);

        sc.close();
    }
}
