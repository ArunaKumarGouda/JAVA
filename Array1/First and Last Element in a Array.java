

import java.util.Scanner;
import java.util.Arrays;

public class FirstAndLastElement {

    static int[] smallestAndlargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]}; 
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements :");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = smallestAndlargestElement(arr);
        System.out.println("Smallest :" + ans[0]);
        System.out.println("Largest :" + ans[1]);
        sc.close();
    }


    // public static void main(String[] args) {
    //     int arr[] = {4, 7, 789, 9, 78, 987};
    //     Arrays.sort(arr);
    //     int n = arr.length;
    //     for (int i = 0; i < n; i++){
    //         System.out.print(arr[i] + " ");
    //     } 
    //     System.out.println();
    //     System.out.println("smallest :" + arr[0]);
    //     System.out.println("largest :" + arr[n - 1]);
    // }

}
