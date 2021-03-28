package leetcode.strings;

/*
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int max = 0;
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (str.length() + i - s.length() >= 0) {
                if (str.length() > max) {
                    max = str.length();
                    break;
                }
            }

            String temp = s.substring(i, i + 1);

            if (str.toString().contains(temp)) {
                if (str.length() > max) {
                    max = str.length();
                }
                str = new StringBuilder(str.substring(str.indexOf(temp) + 1, str.length()));
                str.append(temp);
            } else {
                str.append(temp);
                if (str.length() > max) {
                    max = str.length();
                }
            }
        }

        return max;
    }
}
