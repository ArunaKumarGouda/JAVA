// Given an integer array 'a', return the prefix sum/running sum in the same array without creating a new array.

import java.util.Scanner;

public class Aru_106_Prefix_sum_in_same_array {
    static void printArray(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array is: ");
        printArray(arr);

        int[] pref = makePrefixSumArray(arr);
        System.out.println("Prefix Sum array is: ");
        printArray(pref);
        sc.close();
    }
}
