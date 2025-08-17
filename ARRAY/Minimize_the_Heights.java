import java.util.Arrays;

class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        if (n == 1) return 0;
        
        Arrays.sort(arr);
        
        int ans = arr[n - 1] - arr[0];
        
        for (int i = 0; i < n - 1; i++) {
            int max = Math.max(arr[n - 1] - k, arr[i] + k);
            int min = Math.min(arr[0] + k, arr[i + 1] - k);
            
            if (min < 0) continue;
            
            ans = Math.min(ans, max - min);
        }
        return ans;
    }
}
