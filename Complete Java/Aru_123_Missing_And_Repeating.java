// Given an unsorted array arr[] of size n, containing elements from the range 1 to n, it is known that one number in this range is missing, and another number occurs twice in the array, find both the duplicate number and the missing number.

import java.util.ArrayList;
import java.util.Arrays;

public class Aru_123_Missing_And_Repeating {
    static ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;

        ArrayList<Integer> list = new ArrayList<>();

//        Arrays.sort(arr);
//
//        for(int i = 0; i < n - 1; i++) {
//            if(arr[i] == arr[i + 1]) {
//                list.add(arr[i]);
//                break;
//            }
//        }
//
//        int check = 1;
//        for(int i = 0; i < n; i++) {
//            if(arr[i] == check) {
//                check++;
//            }
//        }
//        list.add(check);

        for(int check = 1; check <= n; check++) {
            boolean found = false;
            for(int i = 0; i < n; i++) {
                if(arr[i] == check) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                list.add(check);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    list.add(0, arr[i]);
                    return list;
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        ArrayList<Integer> list = findTwoElement(arr);
        System.out.println(list);
    }
}
