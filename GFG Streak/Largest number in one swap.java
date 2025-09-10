class Solution {
    public String largestSwap(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        // To store the rightmost position of each digit
        int[] lastIndex = new int[10];
        for (int i = 0; i < n; i++) {
            lastIndex[arr[i] - '0'] = i;
        }

        // Traverse digits from left to right
        for (int i = 0; i < n; i++) {
            // Check from 9 down to current digit+1
            for (int d = 9; d > arr[i] - '0'; d--) {
                if (lastIndex[d] > i) {
                    // Swap
                    char temp = arr[i];
                    arr[i] = arr[lastIndex[d]];
                    arr[lastIndex[d]] = temp;
                    return new String(arr);
                }
            }
        }

        // Already the largest
        return s;
    }
}
