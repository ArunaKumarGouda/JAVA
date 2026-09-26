// You are given an array arr[], the task is to return a list elements of arr in alternate order (starting from index 0).

import java.util.ArrayList;

public class Aru_109_Alternates_in_an_Array {
    static ArrayList<Integer> getAlternates(int arr[]) {
        int n = arr.length;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        ArrayList<Integer> list = getAlternates(arr);
        System.out.println(list);
    }
}
