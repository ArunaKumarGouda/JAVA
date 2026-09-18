// Write a program to reverse an array in the same memory location.

public class // Write a program to reverse an array in the same memory location.

public class Aru_94_Swap_Array {
    static void changeInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            changeInArray(arr, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reverseArray(arr);

        System.out.print("Reversed array is: ");
        for(int i= 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 {
    static void changeInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            changeInArray(arr, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        reverseArray(arr);

        System.out.print("Reversed array is: ");
        for(int i= 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
