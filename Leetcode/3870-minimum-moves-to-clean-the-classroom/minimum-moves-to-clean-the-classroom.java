import java.util.*;

class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();

        int sr = 0, sc = 0;
        List<int[]> litter = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    sr = i;
                    sc = j;
                } else if (ch == 'L') {
                    litter.add(new int[]{i, j});
                }
            }
        }

        int totalLitter = litter.size();

        if (totalLitter == 0) return 0;

        Queue<int[]> queue = new LinkedList<>();

        boolean[][][][] visited =
                new boolean[m][n][energy + 1][1 << totalLitter];

        queue.offer(new int[]{sr, sc, energy, 0});
        visited[sr][sc][energy][0] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int moves = 0;
        int allCollected = (1 << totalLitter) - 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                int[] curr = queue.poll();

                int r = curr[0];
                int c = curr[1];
                int remainingEnergy = curr[2];
                int mask = curr[3];

                if (mask == allCollected) {
                    return moves;
                }

                for (int d = 0; d < 4; d++) {
                    int nr = r + dr[d];
                    int nc = c + dc[d];

                    if (nr < 0 || nr >= m || nc < 0 || nc >= n)
                        continue;

                    char cell = classroom[nr].charAt(nc);

                    if (cell == 'X' || remainingEnergy == 0)
                        continue;

                    int newEnergy = remainingEnergy - 1;
                    int newMask = mask;

                    if (cell == 'L') {
                        for (int i = 0; i < totalLitter; i++) {
                            if (litter.get(i)[0] == nr &&
                                litter.get(i)[1] == nc) {
                                newMask |= (1 << i);
                                break;
                            }
                        }
                    }

                    if (cell == 'R') {
                        newEnergy = energy;
                    }

                    if (!visited[nr][nc][newEnergy][newMask]) {
                        visited[nr][nc][newEnergy][newMask] = true;
                        queue.offer(new int[]{
                            nr, nc, newEnergy, newMask
                        });
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}