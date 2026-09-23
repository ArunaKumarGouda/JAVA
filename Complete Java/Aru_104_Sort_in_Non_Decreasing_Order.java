// Given an integer array 'a' sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

import java.util.Scanner;

public class Aru_104_Sort_in_Non_Decreasing_Order {
    static void printArray(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while(i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static int[] sortSquare(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        int[] ans = new int[n];
        int k = 0;

        while(left <= right) {
            // Bigger number's square is added to ans.
            if(Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
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

        int[] ans = sortSquare(arr);
        System.out.println("Array after sort square:");
        reverse(ans);
        printArray(ans);
        
        sc.close();
    }
}
