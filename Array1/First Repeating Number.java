/*  Q : Given an array 'a' consisting of integer.
        Return the first value that is repeating in this array.
        If no value is being repeated, return -1.  */
                   
package Array;
import java.util.Scanner;

public class RepeatingNumber {

    static int firstRepeatingNumber(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            for ( int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]){
                   return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The first repeating number is :" + firstRepeatingNumber(arr));
        sc.close();
        
    }
}
