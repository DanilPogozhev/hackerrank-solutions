package leetcode.sortings;

public class Problem1528 {
    /**
     * Problem URL: https://leetcode.com/problems/shuffle-string/
     */
    public String restoreString(String str, int[] indices) {
        char[] result = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = str.charAt(i);
        }

        return String.valueOf(result);
    }
}
