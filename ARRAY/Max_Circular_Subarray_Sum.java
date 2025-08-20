class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int n = arr.length;
        int maxKadane = kadane(arr);
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }
        int maxWrap = totalSum + kadane(arr);
        if (maxWrap == 0) {
            return maxKadane;
        }
        return Math.max(maxKadane, maxWrap);
    }
    private int kadane(int[] arr) {
        int maxSoFar = arr[0], currMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
}
