// User function Template for Java

public class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    public static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.println(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        rotateArr(arr, d);
        printArray(arr);
    }
}
