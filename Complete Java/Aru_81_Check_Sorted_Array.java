// Check a given array is sorted or not.

import java.util.Scanner;

public class Aru_81_Check_Sorted_Array {
    static boolean isSorted(int[] arr) {
        boolean check = true;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Is check: " + isSorted(arr));

    }
}
