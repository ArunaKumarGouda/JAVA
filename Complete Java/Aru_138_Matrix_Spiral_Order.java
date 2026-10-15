import java.util.Scanner;

public class Aru_138_Matrix_Spiral_Order {
    static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralMatrix(int[][] matrix, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftColumn = 0, rightColumn = c - 1;

        int totalElement = 0;
        while(totalElement < r * c) {
            // topRow -> leftColumn to rightColumn
            for(int j = leftColumn; j <= rightColumn && totalElement < r * c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElement++;
            }
            topRow++;

            // rightColumn -> topRow to bottomRow
            for(int i = topRow; i <= bottomRow && totalElement < r * c; i++) {
                System.out.print(matrix[i][rightColumn] + " ");
                totalElement++;
            }
            rightColumn--;

            // bottomRow -> rightColumn to leftColumn
            for(int k = rightColumn; k >= leftColumn && totalElement < r * c; k--) {
                System.out.print(matrix[bottomRow][k] + " ");
                totalElement++;
            }
            bottomRow--;

            // leftColumn -> bottomRow to topRow
            for(int l = bottomRow; l >= topRow && totalElement < r * c; l--) {
                System.out.print(matrix[l][leftColumn] + " ");
                totalElement++;
            }
            leftColumn++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();

        int total = r * c;

        int[][] matrix = new int[r][c];

        System.out.println("Enter " + total + " elements: ");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix is; ");
        printMatrix(matrix);

        System.out.println("Spiral matrix is: ");
        printSpiralMatrix(matrix, r, c);

        sc.close();
    }
}
