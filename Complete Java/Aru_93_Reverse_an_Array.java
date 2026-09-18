// Reverse an array consisting of integer values.

public class Aru_93_Reverse_an_Array {
    static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

//        for(int i = n - 1; i >=0; i--) {
//            ans[j++] = arr[i];
//        }

        int i = n -1;
        while(i >= 0) {
            ans[j++] = arr[i];
            i--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] ans = reverseArray(arr);

        System.out.print("Reversed Array is: ");
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
