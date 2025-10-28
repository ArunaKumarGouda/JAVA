import java.util.*;

class Solution {
    public int maxSubarrSum(int[] arr, int a, int b) {
        int n = arr.length;
        long[] prefix = new long[n + 1];
        
        // Compute prefix sums
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;
        TreeSet<Pair> set = new TreeSet<>((p1, p2) -> p1.value != p2.value ?  
                                            Long.compare(p1.value, p2.value) : 
                                            Integer.compare(p1.index, p2.index));

        for (int i = a; i <= n; i++) {
            // Add prefix[i - a] into the set
            set.add(new Pair(prefix[i - a], i - a));

            // Remove prefix[i - b - 1] if it exists
            if (i - b - 1 >= 0) {
                set.remove(new Pair(prefix[i - b - 1], i - b - 1));
            }

            // Get min prefix in the valid window
            if (!set.isEmpty()) {
                long minPrefix = set.first().value;
                maxSum = Math.max(maxSum, (int)(prefix[i] - minPrefix));
            }
        }

        return maxSum;
    }

    static class Pair {
        long value;
        int index;

        Pair(long v, int i) {
            value = v;
            index = i;
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof Pair) {
                Pair other = (Pair) o;
                return this.value == other.value && this.index == other.index;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, index);
        }
    }
}
