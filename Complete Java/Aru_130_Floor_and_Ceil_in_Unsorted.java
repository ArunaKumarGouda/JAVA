// Given an unsorted array arr[] of integers and an integer x, find the floor and ceiling of x in arr[].
//
//Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than the smallest element of arr[].
//Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than the greatest element of arr[].
//Return an array of integers denoting the [floor, ceil]. Return -1 for floor or ceiling if the floor or ceiling is not present.

import java.util.ArrayList;

public class Aru_130_Floor_and_Ceil_in_Unsorted {
    static int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int[] ans = new int[2];

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int n = arr.length;

        for(int i = 0; i < n; i++) {
            if(arr[i] <= x) {
                list1.add(arr[i]);
            }

            if(arr[i] >= x) {
                list2.add(arr[i]);
            }
        }

        int max = Integer.MIN_VALUE;

        if(list1.isEmpty()) {
            max = -1;
        }

        for(int i = 0; i < list1.size(); i++) {
            if(list1.get(i) > max) {
                max = list1.get(i);
            }
        }

        int min = Integer.MAX_VALUE;

        if(list2.isEmpty()) {
            min = -1;
        }

        for(int i = 0; i < list2.size(); i++) {
            if(list2.get(i) < min) {
                min = list2.get(i);
            }
        }

        ans[0] = max;
        ans[1] = min;

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 9, 6, 5, 5, 6};
        int x = 7;
        int[] ans = getFloorAndCeil(x, arr);
        int n = ans.length;

        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
