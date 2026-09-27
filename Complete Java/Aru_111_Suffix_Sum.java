import java.util.Scanner;

public class Aru_111_Suffix_Sum {
    static void printArray(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] suffixSum(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        ans[n - 1] = arr[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            ans[i] = ans[i + 1] + arr[i];
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

        int[] ans = suffixSum(arr);
        System.out.println("Suffix sum array is: ");
        printArray(ans);

        sc.close();
    }
}
