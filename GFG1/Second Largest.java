class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int max = arr[0];
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        
        int secondMax = arr[0];
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax == Integer.MIN_VALUE ? -1 : secondMax;
    }
}
