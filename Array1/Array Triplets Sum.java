// Count the number of triplets whose sum is equal to the given value x.
import java.util.Scanner;

public class ArrayTripletsSum {

    static int tripletsSum(int[] arr, int target){
        int ans = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                for (int k = j + 1; k < n; k++){
                    if (arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        // int[] arr = {1, 4, 5, 6, 3};
        // int target = 12;
        // int ans1 = tripletsSum(arr, target);
        // System.out.println(ans1);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array length :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target Sum :");
        int target = sc.nextInt();

        System.out.println(tripletsSum(arr, target));
        sc.close();
    }
}
