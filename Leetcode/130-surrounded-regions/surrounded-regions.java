class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        // Traverse the first and last columns
        for (int i = 0; i < m; i++) {
            dfs(board, i, 0);
            dfs(board, i, n - 1);
        }

        // Traverse the first and last rows
        for (int j = 0; j < n; j++) {
            dfs(board, 0, j);
            dfs(board, m - 1, j);
        }

        // Capture surrounded regions and restore safe regions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;

        // Out of bounds or not an unvisited O
        if (i < 0 || i >= m || j < 0 || j >= n
                || board[i][j] != 'O') {
            return;
        }

        // Mark this cell as safe
        board[i][j] = '#';

        // Explore all four directions
        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }
}