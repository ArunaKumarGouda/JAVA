import java.util.*;

class Solution {
    public ArrayList<Integer> countBSTs(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n, 0));
        // Pair value with original index
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = arr[i];
            pairs[i][1] = i;
        }
        // Sort by value to get ranks (number of elements less than current)
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
        // Compute Catalan numbers up to n (using long to reduce overflow risk)
        long[] catalan = new long[n + 1];
        catalan[0] = 1;
        for (int i = 1; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - 1 - j];
            }
        }
        // For each sorted position i (rank), compute C[i] * C[n-i-1]
        for (int i = 0; i < n; i++) {
            int origIndex = pairs[i][1];
            long ways = catalan[i] * catalan[n - i - 1];
            // If result fits in int, store as int. Otherwise cap to Integer.MAX_VALUE (or choose a better policy).
            int val = (ways > Integer.MAX_VALUE) ? Integer.MAX_VALUE : (int) ways;
            result.set(origIndex, val);
        }
        return result;
    }

    // quick test
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr1 = {2, 1, 3};
        System.out.println(s.countBSTs(arr1)); // [1, 2, 2]

        int[] arr2 = {2, 1};
        System.out.println(s.countBSTs(arr2)); // [1, 1]
    }
}
