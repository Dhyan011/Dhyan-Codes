class Solution {
    public int uniquePaths(int[][] grid) {
        int mod = 1_000_000_007;
        int m = grid.length;
        int n = grid[0].length;

        long[][] fromLeft = new long[m][n];
        long[][] fromAbove = new long[m][n];

        fromLeft[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    long ways = 1;
                    if (j + 1 < n) {
                        fromLeft[i][j + 1] = (fromLeft[i][j + 1] + ways) % mod;
                    }
                    if (i + 1 < m) {
                        fromAbove[i + 1][j] = (fromAbove[i + 1][j] + ways) % mod;
                    }
                    continue;
                }

                if (i == m - 1 && j == n - 1) {
                    continue;
                }

                if (grid[i][j] == 1) {
                    if (i + 1 < m) {
                        fromAbove[i + 1][j] =
                            (fromAbove[i + 1][j] + fromLeft[i][j]) % mod;
                    }
                    if (j + 1 < n) {
                        fromLeft[i][j + 1] =
                            (fromLeft[i][j + 1] + fromAbove[i][j]) % mod;
                    }
                } else {
                    long ways = (fromLeft[i][j] + fromAbove[i][j]) % mod;

                    if (j + 1 < n) {
                        fromLeft[i][j + 1] = (fromLeft[i][j + 1] + ways) % mod;
                    }
                    if (i + 1 < m) {
                        fromAbove[i + 1][j] = (fromAbove[i + 1][j] + ways) % mod;
                    }
                }
            }
        }

        return (int) ((fromLeft[m - 1][n - 1] + fromAbove[m - 1][n - 1]) % mod);
    }
}