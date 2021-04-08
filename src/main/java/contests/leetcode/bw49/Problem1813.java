package contests.leetcode.bw49;

public class Problem1813 {
    /**
     * Problem URL: https://leetcode.com/problems/sentence-similarity-iii/
     */
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (sentence1.equals(sentence2)) {
            return true;
        }

        String[] sen1Array = sentence1.split(" ");
        String[] sen2Array = sentence2.split(" ");

        if (sen1Array.length <= sen2Array.length) {
            return decide(sen1Array, sen2Array);
        } else {
            return decide(sen2Array, sen1Array);
        }
    }

    private boolean decide(String[] arrayOne, String[] arrayTwo) {
        int i = 0;
        while (i < arrayOne.length && arrayOne[i].equals(arrayTwo[i])) {
            ++i;
        }
        while (i < arrayOne.length && arrayOne[i].equals(arrayTwo[arrayTwo.length - arrayOne.length + i])) {
            ++i;
        }

        return i == arrayOne.length;
    }
}
