// Given a sorted array arr[] with possibly some duplicates, find the first and last occurrences of an element x in the given array.
//Note: If the number x is not found in the array then return both the indices as -1.

import java.util.ArrayList;
public class Aru_137_First_and_Last_in_Sorted {
    static ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> list = new ArrayList<>();

        int n = arr.length;

        int firstOccurances = -1;
        int lastOccurances = -1;

        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] == x) {
                firstOccurances = i;
            }
        }

        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                lastOccurances = i;
            }
        }

        list.add(firstOccurances);
        list.add(lastOccurances);

        return list;
    }

    public static void main(String[] args) {
    int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
    int x = 5;

    ArrayList<Integer> list = find(arr, x);
    for(int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + " ");
    }
    }
}
