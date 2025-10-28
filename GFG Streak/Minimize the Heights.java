int n = arr.length;
        if (n == 1) return 0;
        
        Arrays.sort(arr);

        // Initial difference
        int ans = arr[n - 1] - arr[0];

        int smallest = arr[0] + k; 
        int largest = arr[n - 1] - k;

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) continue; // height can't be negative

            int minVal = Math.min(smallest, arr[i] - k);
            int maxVal = Math.max(largest, arr[i - 1] + k);

            ans = Math.min(ans, maxVal - minVal);
        }

        return ans;
