import java.util.Arrays;

public class Aru_77_Array_Clone {
    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 55, 29, 39, 2};

        System.out.print("Original array: ");
        printArray(arr);

        int[] arr2 = arr.clone();

        arr2[0] = 0;
        arr2[1] = 0;

        System.out.print("Changed array: ");
        printArray(arr2);

        System.out.print("Original array: ");
        printArray(arr);

        int[] arr3 = Arrays.copyOf(arr2, arr2.length);
        System.out.print("Copied array 2: ");
        printArray(arr3);
    }
}
