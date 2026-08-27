class Solution {
    public String lexGreaterPermutation(String s, String target) {

        int n = s.length();

        // Count characters in s
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Try to build target from left to right
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < n; i++) {

            int current = target.charAt(i) - 'a';

            // Try to use the same character as target
            if (count[current] > 0) {

                prefix.append(target.charAt(i));
                count[current]--;

            } else {

                // Cannot use target[i].
                // Find the smallest character greater than target[i].
                for (int c = current + 1; c < 26; c++) {

                    if (count[c] > 0) {

                        prefix.append((char) ('a' + c));
                        count[c]--;

                        // Add all remaining characters
                        // in alphabetical order.
                        for (int x = 0; x < 26; x++) {
                            while (count[x] > 0) {
                                prefix.append((char) ('a' + x));
                                count[x]--;
                            }
                        }

                        return prefix.toString();
                    }
                }

                // We cannot make the answer greater at this position.
                break;
            }
        }

        /*
         * If we reach here, we need to go backwards
         * and change an earlier character.
         */

        // Try every position from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Count characters available for this attempt
            int[] remaining = new int[26];

            for (char c : s.toCharArray()) {
                remaining[c - 'a']++;
            }

            // Use target's prefix [0 ... i-1]
            boolean possible = true;

            for (int j = 0; j < i; j++) {

                int x = target.charAt(j) - 'a';

                if (remaining[x] == 0) {
                    possible = false;
                    break;
                }

                remaining[x]--;
            }

            if (!possible) {
                continue;
            }

            // At position i, find smallest character
            // greater than target[i]
            int current = target.charAt(i) - 'a';

            for (int c = current + 1; c < 26; c++) {

                if (remaining[c] > 0) {

                    StringBuilder answer = new StringBuilder();

                    // Add target prefix
                    for (int j = 0; j < i; j++) {
                        answer.append(target.charAt(j));
                    }

                    // Add the bigger character
                    answer.append((char) ('a' + c));
                    remaining[c]--;

                    // Add remaining characters smallest first
                    for (int x = 0; x < 26; x++) {
                        while (remaining[x] > 0) {
                            answer.append((char) ('a' + x));
                            remaining[x]--;
                        }
                    }

                    return answer.toString();
                }
            }
        }

        return "";
    }
}