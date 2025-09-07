class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int idx = 0;
        // add pairs (1,-1), (2,-2), ...
        for (int i = 1; idx + 1 < n; i++) {
            ans[idx++] = i;
            ans[idx++] = -i;
        }
        // if n is odd, put 0 in the last slot
        if (idx < n)
            ans[idx] = 0;
        return ans;
    }
}
