// Given an array of integers of size n. Answer q queries where you need to print the sum of values in a given range of indices from 1 to r(both included).
// Note: The values of 1 and r in queries follows 1-based indexing.

import java.util.Scanner;

public class Aru_107_Prefix_Sum_in_a_Range {
    static void printArray(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixSum(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
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

        int[] pref = prefixSum(arr);

        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();

        while(q-- > 0) {
            System.out.println("Enter range: ");
            System.out.print("l = ");
            int l = sc.nextInt();

            System.out.print("r = ");
            int r = sc.nextInt();

            int ans = pref[r] - pref[l - 1];
            System.out.println("Sum: " + ans);
        }

        sc.close();
    }
}
