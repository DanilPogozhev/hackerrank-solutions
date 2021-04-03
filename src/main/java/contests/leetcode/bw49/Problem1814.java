package contests.leetcode.bw49;

import java.util.HashMap;
import java.util.Map;

public class Problem1814 {

    /**
     * Solution based on discussion section.
     * Author URL: https://leetcode.com/lee215/
     */
    public int countNicePairs(int[] nums) {
        int counter = 0;
        int mod = (int) 1e9 + 7;
        Map<Integer, Integer> pairs = new HashMap<>();
        for (int i : nums) {
            int reverseI = rev(i);
            int iCounter = pairs.getOrDefault(i - reverseI, 0);
            pairs.put(i - reverseI, iCounter + 1);
            counter = (counter + iCounter) % mod;
        }

        return counter;
    }

    private int rev(int number) {
        int reverse = 0;

        while (number > 0) {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }

        return reverse;
    }
}
