class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int n = s.length();

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int odd = 0;
        int middle = -1;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                odd++;
                middle = i;
            }
        }

        if (odd > 1) {
            return "";
        }

        int halfLen = n / 2;

        int[] halfFreq = new int[26];

        for (int i = 0; i < 26; i++) {
            halfFreq[i] = freq[i] / 2;
        }

        String answer = "";

        for (int pivot = halfLen - 1; pivot >= 0; pivot--) {
            int[] remaining = halfFreq.clone();
            boolean possible = true;

            for (int i = 0; i < pivot; i++) {
                int x = target.charAt(i) - 'a';

                if (remaining[x] == 0) {
                    possible = false;
                    break;
                }

                remaining[x]--;
            }

            if (!possible) {
                continue;
            }

            int targetChar = target.charAt(pivot) - 'a';

            for (int c = targetChar + 1; c < 26; c++) {
                if (remaining[c] == 0) {
                    continue;
                }

                remaining[c]--;

                char[] half = new char[halfLen];

                for (int i = 0; i < pivot; i++) {
                    half[i] = target.charAt(i);
                }

                half[pivot] = (char) ('a' + c);

                int pos = pivot + 1;

                for (int x = 0; x < 26; x++) {
                    while (remaining[x] > 0) {
                        half[pos++] = (char) ('a' + x);
                        remaining[x]--;
                    }
                }

                String candidate = buildPalindrome(half, middle);

                if (candidate.compareTo(target) > 0) {
                    if (answer.equals("") || candidate.compareTo(answer) < 0) {
                        answer = candidate;
                    }
                }

                remaining[c]++;
            }
        }

        int[] remaining = halfFreq.clone();
        boolean possible = true;

        for (int i = 0; i < halfLen; i++) {
            int x = target.charAt(i) - 'a';

            if (remaining[x] == 0) {
                possible = false;
                break;
            }

            remaining[x]--;
        }

        if (possible) {
            char[] half = new char[halfLen];

            for (int i = 0; i < halfLen; i++) {
                half[i] = target.charAt(i);
            }

            String candidate;

            if (n % 2 == 1) {
                int targetMiddle = target.charAt(halfLen) - 'a';

                if (middle > targetMiddle) {
                    candidate = buildPalindrome(half, middle);

                    if (answer.equals("") || candidate.compareTo(answer) < 0) {
                        answer = candidate;
                    }
                } else if (middle == targetMiddle) {
                    candidate = buildPalindrome(half, middle);

                    if (candidate.compareTo(target) > 0 &&
                        (answer.equals("") || candidate.compareTo(answer) < 0)) {
                        answer = candidate;
                    }
                }
            } else {
                candidate = buildPalindrome(half, middle);

                if (candidate.compareTo(target) > 0 &&
                    (answer.equals("") || candidate.compareTo(answer) < 0)) {
                    answer = candidate;
                }
            }
        }

        return answer;
    }

    private String buildPalindrome(char[] half, int middle) {
        StringBuilder sb = new StringBuilder();

        for (char c : half) {
            sb.append(c);
        }

        if (middle != -1) {
            sb.append((char) ('a' + middle));
        }

        for (int i = half.length - 1; i >= 0; i--) {
            sb.append(half[i]);
        }

        return sb.toString();
    }
}
