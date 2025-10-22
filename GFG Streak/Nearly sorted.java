import java.util.*;

class Solution {
    public void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int index = 0;

        // Add first k+1 elements
        for (int i = 0; i <= k && i < arr.length; i++) {
            pq.add(arr[i]);
        }

        // Process remaining elements
        for (int i = k + 1; i < arr.length; i++) {
            arr[index++] = pq.poll();
            pq.add(arr[i]);
        }

        // Extract remaining elements
        while (!pq.isEmpty()) {
            arr[index++] = pq.poll();
        }
    }
}
