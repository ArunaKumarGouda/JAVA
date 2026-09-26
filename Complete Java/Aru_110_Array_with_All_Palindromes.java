// Given an array arr[] of positive integers. Return true if all the array elements are palindrome otherwise, return false.

public class Aru_110_Array_with_All_Palindromes {
    public static boolean isPalinArray(int[] arr) {
        // code here.
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int num = arr[i];
            int original = arr[i];
            int reverse = 0;
            while(num > 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }

            if(reverse != original) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {111, 222, 333, 444, 555};
        boolean check = isPalinArray(arr);
        System.out.println(check);
    }
}
