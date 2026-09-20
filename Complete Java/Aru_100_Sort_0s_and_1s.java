// Sort an array consisting of only 0s and 1s.

import java.util.Scanner;
public class Aru_100_Sort_0s_and_1s {
    static void printArray(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sortZerosAndOnes(int[] arr) {
        int n = arr.length;
        int countZeros = 0;

        // count number of zeros
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                countZeros++;
            }
        }
        // 0 to countZeros - 1: 0, countZeros to n - 1: 1.
        for(int i = 0; i < n; i++) {
            if(i < countZeros) {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array is: ");
        printArray(arr);

        sortZerosAndOnes(arr);
        System.out.println("Sorted array: ");
        printArray(arr);

        sc.close();
    }
}
