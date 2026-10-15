import java.util.ArrayList;
import java.util.Collections;

public class Aru_140_Reverse_Array_in_Groups {
    static void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length;

        for(int i = 0; i < n; i += k) {
            ArrayList<Integer> list = new ArrayList<>();

            int end = Math.min(i + k, n);

            for(int j = i; j < end; j++) {
                list.add(arr[j]);
            }

            Collections.reverse(list);

            for(int j = i; j < end; j++) {
                arr[j] = list.get(j - i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        reverseInGroups(arr, k);
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
