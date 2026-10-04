// Given an unsorted array arr containing both positive and negative numbers. Your task is to rearrange the array and convert it into an array of alternate positive and negative numbers without changing the relative order.
// Note:
// Resulting array should start with a positive integer (0 will also be considered as a positive integer).
// If any of the positive or negative integers are exhausted, then add the remaining integers in the answer as it is by maintaining the relative order.

import java.util.ArrayList;

public class Aru_124_Alternate_Positive_Negative {
    static void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) >= 0) {
                positive.add(arr.get(i));
            }

            if(arr.get(i) < 0) {
                negative.add(arr.get(i));
            }
        }

        int p = 0;
        int n = 0;
        int i = 0;

        while(p < positive.size() && n < negative.size()) {
            arr.set(i++, positive.get(p++));
            arr.set(i++, negative.get(n++));
        }

        while(p < positive.size()) {
            arr.set(i++, positive.get(p++));
        }

        while(n < negative.size()) {
            arr.set(i++, negative.get(n++));
        }
    }

    public static void main(String[] args) {
        int[] nums = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(nums[i]);
        }

        rearrange(arr);
        System.out.println(arr);
    }
}
