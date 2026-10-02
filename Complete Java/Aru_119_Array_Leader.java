// You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.

import java.util.ArrayList;

public class Aru_119_Array_Leader {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            boolean leader = true;
            for(int j = i + 1; j < n; j++) {
                if(arr[i] < arr[j]) {
                    leader = false;
                }
            }
            if(leader) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> list = leaders(arr);
        System.out.println(list);
    }
}
