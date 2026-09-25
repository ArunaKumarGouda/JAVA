// Check if we can partition the array into two subarrays with equal sum. More formally, check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array.

import java.util.Scanner;

public class Aru_108_Two_Subarray_with_equal_sum {
    static void printArray(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int findArraySum(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        for(int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr) {
        int totalSum = findArraySum(arr);
        int n = arr.length;

        int prefixSum = 0;
        for(int i = 0; i < n; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;

            if(suffixSum == prefixSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        System.out.println("Enter " + n + " elements: ");
        // for 1-based indexing
        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array is: ");
        printArray(arr);

        System.out.println("Equal partition possible: " + equalSumPartition(arr));
    }
}
