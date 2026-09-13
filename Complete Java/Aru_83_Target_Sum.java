// Find the total number of pairs in the Array whose sum is equal to the given value x.

public class Aru_83_Target_Sum {
    static int targetSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if((arr[i]  + arr[j]) == target) {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 5, 8, 2};
        int target = 7;
        System.out.println(targetSum(arr, target));
    }
}
