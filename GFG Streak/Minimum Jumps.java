class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;  // define n here

        if (n <= 1) return 0; // already at last index
        if (arr[0] == 0) return -1; // cannot move anywhere

        int jumps = 0, end = 0, farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);

            if (i == end) { // must take a jump
                jumps++;
                end = farthest;

                if (end >= n - 1) return jumps; // reached last index
            }
        }

        return -1;
        
    }
}
