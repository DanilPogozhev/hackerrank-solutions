package solutions.hashmaps.strings.two;

import java.util.HashSet;
import java.util.Set;

public class MySolution {
    static String twoStrings(String s1, String s2) {
        Set<Character> characters = new HashSet<>();
        for (Character c : s1.toCharArray()) {
            characters.add(c);
        }

        for (Character c : s2.toCharArray()) {
            if (characters.contains(c)) {
                return "YES";
            }
        }

        return "NO";
    }
}
