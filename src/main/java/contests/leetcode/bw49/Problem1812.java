package contests.leetcode.bw49;

public class Problem1812 {
    public boolean squareIsWhiteMine(String coordinates) {
        int letterIndex = "abcdefgh".indexOf(coordinates.charAt(0)) + 1;
        int index = coordinates.charAt(1);

        return letterIndex % 2 != 0 && index % 2 == 0
                || letterIndex % 2 == 0 && index % 2 != 0;
    }

    /*
     * Author URL: https://leetcode.com/MaratKhakim/
     * Solution URL: https://leetcode.com/problems/determine-color-of-a-chessboard-square/discuss/1140516/Very-easy-Java-solution-with-explanation
     */
    public boolean squareIsWhite(String coordinates) {
        int letterIndex = coordinates.charAt(0) - 'a';
        int index = coordinates.charAt(1) - '0';

        return (letterIndex + index) % 2 == 0;
    }
}
