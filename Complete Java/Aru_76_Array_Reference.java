import java.util.Scanner;

public class Aru_76_Array_Reference {
    static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        printArray(arr);

        int[] arr_2 = arr;
        System.out.println("Copied array: ");
        printArray(arr_2);

        // changing some value of arr_2
        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("Original array after changing arr_2: ");
        printArray(arr);

        System.out.println("Copied array after changing arr_2: ");
        printArray(arr_2);

        sc.close();
    }
}
