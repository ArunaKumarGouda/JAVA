// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
// Return the answer in an array.

import java.util.Scanner;

public class Aru_113_Smaller_than_Current_Number {
    static void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(nums[i] > nums[j]) {
                    count++;
                }
            }
            ans[i] = count;
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

        System.out.println("The smaller number than current number is: ");
        int[] ans = smallerNumbersThanCurrent(arr);
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
