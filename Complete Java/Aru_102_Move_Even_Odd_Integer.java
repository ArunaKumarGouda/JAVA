// Given an array of integers 'a', move all the even integers at the beginning of the array followed by all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfy the condition.

import java.util.Scanner;
public class Aru_102_Move_Even_Odd_Integer {
    static void printArray(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void rotateArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortArrayByParity(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while(i < j) {
            if(arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                rotateArray(arr, i, j);
                i++;
                j--;
            }

            if(arr[i] % 2 == 0) {
                i++;
            }

            if(arr[j] % 2 != 0) {
                j--;
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

        System.out.println("Array before rotation: ");
        printArray(arr);

        sortArrayByParity(arr);
        System.out.println("Array after rotation: ");
        printArray(arr);

        sc.close();
    }
}
