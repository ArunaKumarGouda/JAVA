import java.util.*;

class Solution {
    private final int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
    private final int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    public ArrayList<ArrayList<Integer>> knightTour(int n) {
        int[][] board = new int[n][n];
        for (int[] row : board)
            Arrays.fill(row, -1);

        board[0][0] = 0; // Start from (0, 0)

        if (solve(board, 0, 0, 1, n)) {
            return convertToArrayList(board);
        } else {
            return new ArrayList<>(); // No solution exists
        }
    }

    private boolean solve(int[][] board, int x, int y, int moveCount, int n) {
        if (moveCount == n * n)
            return true;

        for (int i = 0; i < 8; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (isSafe(nextX, nextY, board, n)) {
                board[nextX][nextY] = moveCount;
                if (solve(board, nextX, nextY, moveCount + 1, n))
                    return true;
                board[nextX][nextY] = -1; // Backtrack
            }
        }
        return false;
    }

    private boolean isSafe(int x, int y, int[][] board, int n) {
        return (x >= 0 && y >= 0 && x < n && y < n && board[x][y] == -1);
    }

    private ArrayList<ArrayList<Integer>> convertToArrayList(int[][] board) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int[] row : board) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int val : row) {
                temp.add(val);
            }
            result.add(temp);
        }
        return result;
    }
}
