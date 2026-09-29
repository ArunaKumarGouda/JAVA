// Given an unsorted array arr[]. Find the count of elements less than or equal to the given element

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Aru_114_Count_Smaller_in_Array {
    static int countOfElements(int x, List<Integer> arr) {
        // code here
        int n = arr.size();

        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) <= x) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println("Enter X: ");
        int x = sc.nextInt();

        int count = countOfElements(x, arr);
        System.out.print("Count of element is: " + count);

        sc.close();
    }
}
