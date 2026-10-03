// Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.
//Note: You can return the elements in any order but the driver code will print them in sorted order.

import java.util.ArrayList;

public class Aru_121_Duplicate_in_a_Limited_Range_Array {
    static ArrayList<Integer> findDuplicates(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            boolean check = true;
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    check = false;
                    break;
                }
            }
            if(!check) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};
        ArrayList<Integer> list = findDuplicates(arr);
        System.out.println(list);
    }
}
