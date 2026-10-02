class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {

        int n = s1.length();
        int m = s2.length();

        if (n + m != s3.length()) {
            return false;
        }

        // Make s2 the shorter string to minimize memory
        if (m > n) {
            return isInterleave(s2, s1, s3);
        }

        boolean[] dp = new boolean[m + 1];

        dp[0] = true;

        // First row: only s2
        for (int j = 1; j <= m; j++) {
            dp[j] = dp[j - 1] &&
                    s2.charAt(j - 1) == s3.charAt(j - 1);
        }

        for (int i = 1; i <= n; i++) {

            // First column: only s1
            dp[0] = dp[0] &&
                    s1.charAt(i - 1) == s3.charAt(i - 1);

            for (int j = 1; j <= m; j++) {

                char c = s3.charAt(i + j - 1);

                boolean fromS1 = dp[j] &&
                        s1.charAt(i - 1) == c;

                boolean fromS2 = dp[j - 1] &&
                        s2.charAt(j - 1) == c;

                dp[j] = fromS1 || fromS2;
            }
        }

        return dp[m];
    }
}