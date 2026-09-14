// Count the number of triplets whose sum is equal to the given value x.

public class Aru_84_Count_Triplets_Number {
    static int tripletsSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    if((arr[i] + arr[j] + arr[k]) == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 3};
        int target = 12;

        System.out.println(tripletsSum(arr, target));
    }
}
