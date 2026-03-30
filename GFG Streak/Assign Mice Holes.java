import java.util.*;

class Solution {
    public int assignHole(int[] mices, int[] holes) {
        // Step 1: Sort both arrays
        Arrays.sort(mices);
        Arrays.sort(holes);

        int n = mices.length;
        int maxTime = 0;

        // Step 2: Pair mice[i] with holes[i]
        for (int i = 0; i < n; i++) {
            maxTime = Math.max(maxTime, Math.abs(mices[i] - holes[i]));
        }

        // Step 3: Return maximum time taken
        return maxTime;
    }

    // Main to test
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] mices = {4, -4, 2};
        int[] holes = {4, 0, 5};

        System.out.println(sol.assignHole(mices, holes)); 
        // Output: 4
    }
}
