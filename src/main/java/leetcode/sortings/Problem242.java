package leetcode.sortings;

public class Problem242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] englishLetters = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 97;
            englishLetters[index]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 97;
            englishLetters[index]--;
        }

        for (int englishLetter : englishLetters) {
            if (englishLetter != 0) {
                return false;
            }
        }

        return true;
    }
}
