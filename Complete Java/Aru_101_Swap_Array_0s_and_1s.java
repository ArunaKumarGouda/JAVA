// Sort an array consisting of only 0s and 1s.

import java.util.Scanner;

public class Aru_101_Swap_Array_0s_and_1s {
    static void printArray(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortArray(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while(left < right) {
            if(arr[left] == 1 && arr[right] == 0) {
                swapArray(arr, left, right);
                left++;
                right--;
            }

            if(arr[left] == 0) {
                left++;
            }

            if(arr[right] == 1) {
                right--;
            }
        }
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

        sortArray(arr);
        System.out.println("Sorted array is: ");
        printArray(arr);

        sc.close();
    }
}
