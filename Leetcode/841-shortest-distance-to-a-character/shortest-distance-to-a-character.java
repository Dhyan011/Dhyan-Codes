class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        int prev = -n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = i - prev;
        }

        int next = 2 * n;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                next = i;
            }
            ans[i] = Math.min(ans[i], next - i);
        }

        return ans;
    }
}