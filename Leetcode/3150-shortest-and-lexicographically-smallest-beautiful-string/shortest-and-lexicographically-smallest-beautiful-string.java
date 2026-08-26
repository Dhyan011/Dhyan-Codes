class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int left = 0;
        int ones = 0;

        int minLength = Integer.MAX_VALUE;
        String answer = "";

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            if (s.charAt(right) == '1') {
                ones++;
            }

            // We have exactly k ones
            if (ones == k) {

                // Remove unnecessary zeros from the left
                while (s.charAt(left) == '0') {
                    left++;
                }

                // Current beautiful substring
                int length = right - left + 1;
                String current = s.substring(left, right + 1);

                // Check if it is better
                if (length < minLength ||
                    (length == minLength && current.compareTo(answer) < 0)) {

                    minLength = length;
                    answer = current;
                }

                // Move left past the first 1
                left++;
                ones--;
            }
        }

        return answer;
    }
}