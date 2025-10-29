

/* Q : Rotate the given array 'a' by k steps, where k is non-negative.
       Note : k can be greater then  as well.
 */
import java.util.Scanner;

public class Rotare_an_Array {

    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++){
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K");
        int k = sc.nextInt();

        System.out.println("Orginal array :");
        int[] ans = rotate(arr, k);
        System.out.println("Array after rotation :");
        System.out.println(ans);
        sc.close();
    }
}
