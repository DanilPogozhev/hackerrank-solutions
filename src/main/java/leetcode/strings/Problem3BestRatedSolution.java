package leetcode.strings;

import java.util.HashMap;
import java.util.Map;

/*
 * Not mine solution. For the future analysis.
 * Solution url: https://leetcode.com/problems/longest-substring-without-repeating-characters/discuss/1729/11-line-simple-Java-solution-O(n)-with-explanation
 * Author url:   https://leetcode.com/cbmbbz/
 */
public class Problem3BestRatedSolution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
