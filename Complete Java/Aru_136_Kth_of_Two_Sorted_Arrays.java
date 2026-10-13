// Given two sorted arrays a[] and b[] and an element k, find the element that would be at the kth position of the combined sorted array.

import java.util.ArrayList;
import java.util.Collections;

public class Aru_136_Kth_of_Two_Sorted_Arrays {
    static int kthElement(int a[], int b[], int k) {
        // code here
        int m = a.length;
        int n = b.length;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            list.add(a[i]);
        }

        for(int i = 0; i < n; i++) {
            list.add(b[i]);
        }

        Collections.sort(list);

        int found  = 0;
        for(int i = 1; i <= list.size(); i++) {
            if(i == k) {
                found = list.get(i - 1);
            }
        }
        return found;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;
        int ans = kthElement(a, b, k);
        System.out.println(ans);
    }
}
