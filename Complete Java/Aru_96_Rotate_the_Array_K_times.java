// Rotate the given array 'a' by k steps, where k is non-negative without using extra space.
// Note: k can be greater than n as well.

public class Aru_96_Rotate_the_Array_K_times {
    static void rotate(int[] arr, int k) {
        int n = arr.length;
        int i = 0, j = n - 1;
        k = k % n;
        while(i < j) {
            rotateArray(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 5;
        rotate(arr, k);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
