import java.util.*;

class Solution {
    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) return 0;

        int m = heightMap.length;
        int n = heightMap[0].length;

        boolean[][] visited = new boolean[m][n];
        PriorityQueue<Cell> pq = new PriorityQueue<>(Comparator.comparingInt(c -> c.height));

        // Add all boundary cells to the priority queue and mark them visited
        for (int i = 0; i < m; i++) {
            pq.offer(new Cell(i, 0, heightMap[i][0]));
            pq.offer(new Cell(i, n - 1, heightMap[i][n - 1]));
            visited[i][0] = true;
            visited[i][n - 1] = true;
        }

        for (int j = 1; j < n - 1; j++) {
            pq.offer(new Cell(0, j, heightMap[0][j]));
            pq.offer(new Cell(m - 1, j, heightMap[m - 1][j]));
            visited[0][j] = true;
            visited[m - 1][j] = true;
        }

        int waterTrapped = 0;
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while (!pq.isEmpty()) {
            Cell cell = pq.poll();

            for (int[] dir : dirs) {
                int ni = cell.row + dir[0];
                int nj = cell.col + dir[1];

                if (ni >= 0 && ni < m && nj >= 0 && nj < n && !visited[ni][nj]) {
                    visited[ni][nj] = true;

                    int neighborHeight = heightMap[ni][nj];
                    // If neighbor is lower, water can be trapped
                    if (neighborHeight < cell.height) {
                        waterTrapped += cell.height - neighborHeight;
                    }

                    // Push the max height to ensure water doesn't flow backward
                    pq.offer(new Cell(ni, nj, Math.max(neighborHeight, cell.height)));
                }
            }
        }

        return waterTrapped;
    }

    static class Cell {
        int row, col, height;

        Cell(int row, int col, int height) {
            this.row = row;
            this.col = col;
            this.height = height;
        }
    }
}
