import java.util.Arrays;

public class Aru_82_return_array_Smallest_and_Largest {
    static int[] smallestAndLargest(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 56, 1, 7, 2};
        int[] ans = smallestAndLargest(arr);
        System.out.println("Smallest = " + ans[0]);
        System.out.println("Largest = " + ans[1]);
    }
}
