class Solution {
    public int missingNumber(int[] arr) {
        // code here
         int n = arr.length;
         for (int i = 0; i < n; i++) {
             if (arr[i] <= 0 || arr[i] > n) {
                 arr[i] = n + 1;
             }
         }
         for (int i = 0; i < n; i++) {
             int val = Math.abs(arr[i]);
             if (val <= n && arr[val - 1] > 0) {
                 arr[val - 1] = -arr[val - 1];
             }
         }
         for (int i = 0; i < n; i++) {
             if (arr[i] > 0) {
                 return i + 1;
             }
         }
         return n + 1;
    }
}
