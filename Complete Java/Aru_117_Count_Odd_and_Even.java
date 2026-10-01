// Given an array arr[] of positive integers. The task is to return the count of the number of odd and even elements in the array.
//Note: Return two elements where the first one in the count of odd & second one is the count of even.

public class Aru_117_Count_Odd_and_Even {
    static int[] countOddEven(int[] arr) {
        int n = arr.length;

        int countOdd = 0;
        int countEven = 0;

        int[] ans = new int[2];
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                countEven++;
            }
            else {
                countOdd++;
            }
        }
        ans[0] = countOdd;
        ans[1] = countEven;

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = countOddEven(arr);

        int n = ans.length;
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
