// Rotate the given array 'a' by k steps, where k is non-negative.
// Note: k can be greater than n as well.

import java.util.Scanner;

public class Aru_95_Rotate_an_Array {

    static int[] rotateArray(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        int j = 0;
        int[] ans = new int[n];

        // Put last k elements first
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        // Put remaining elements after them
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rotation: ");
        int k = sc.nextInt();

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array before rotation: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int[] ans = rotateArray(arr, k);

        System.out.print("Array after rotation: ");

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}
