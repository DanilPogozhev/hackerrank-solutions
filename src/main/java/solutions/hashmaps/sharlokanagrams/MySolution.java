package solutions.hashmaps.sharlokanagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MySolution {

    /*
     * The solution is based on a comment below:
     * https://www.hackerrank.com/challenges/sherlock-and-anagrams/forum/comments/919479
     */
    static int sherlockAndAnagrams(String s) {
        Map<String, Integer> variants = new HashMap<>();

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                char[] tempArray = temp.toCharArray();
                Arrays.sort(tempArray);
                temp = new String(tempArray);
                Integer varCount = variants.get(temp);

                if (varCount == null) {
                    variants.put(temp, 1);
                } else {
                    //The place which I didn't realise.
                    result += varCount;
                    variants.put(temp, varCount + 1);
                }

            }
        }

        return result;
    }
}