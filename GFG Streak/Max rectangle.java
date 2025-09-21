class Solution {
    // Helper function to calculate the largest rectangle area in a histogram
    static int maxHistogramArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        int[] stack = new int[n + 1];  // Stack to store indices of the histogram
        int top = -1;
        
        // Traverse the histogram
        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];  // Append 0 at the end to flush the stack
            while (top >= 0 && h < heights[stack[top]]) {
                int height = heights[stack[top--]];
                int width = (top == -1) ? i : i - stack[top] - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack[++top] = i;
        }
        
        return maxArea;
    }

    // Main function to find the maximal rectangle area in a binary matrix
    static int maxArea(int mat[][]) {
        if (mat == null || mat.length == 0 || mat[0].length == 0)
            return 0;
        
        int n = mat.length;
        int m = mat[0].length;
        int[] height = new int[m];
        int maxRectangleArea = 0;
        
        // Traverse each row of the matrix
        for (int i = 0; i < n; i++) {
            // Update the histogram heights
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0)
                    height[j] = 0;
                else
                    height[j]++;
            }
            
            // Find the maximum area for this histogram (using the helper function)
            maxRectangleArea = Math.max(maxRectangleArea, maxHistogramArea(height));
        }
        
        return maxRectangleArea;
    }
}
