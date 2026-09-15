// Find the second-smallest element in the given array.

public class Aru_89_Second_Smallest_Element {
    static int secondSmallest(int[] arr) {
        int n = arr.length;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        for(int i = 0; i < n; i++) {
            if(arr[i] == smallest) {
                arr[i] = Integer.MAX_VALUE;
            }
        }

        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        int[] arr = {9, 8, 9, 6, 11, 5, 8};
        System.out.println("The second smallest element is: " + secondSmallest(arr));
    }
}
