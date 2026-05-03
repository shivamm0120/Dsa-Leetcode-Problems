class Solution {

    public String longestPalindrome(String s) {

        if (s == null || s.length() < 2) return s;

        int start = 0, end = 0;
        int maxLen = 1;

        for (int i = 0; i < s.length(); i++) {

            // odd length palindrome
            int len1 = expand(s, i, i);

            // even length palindrome
            int len2 = expand(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > maxLen) {
                maxLen = len;

                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right) {

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        // subtract overshoot
        return right - left - 1;
    }
}