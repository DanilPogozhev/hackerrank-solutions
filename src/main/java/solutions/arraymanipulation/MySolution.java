package solutions.arraymanipulation;

public class MySolution {
    /**
     * This is a bad solution because:
     * 1. I tried to update the whole subsection [a, b] which led to O(m*m) runtime operations.
     * 2. At each update step I did comparison for max value which added me another O(n*m) runtime operations.
     */
    static long arrayManipulation(int n, int[][] queries) {
        long[] array = new long[n];
        long max = 0;
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0] - 1;
            int end = queries[i][1] - 1;
            int plus = queries[i][2];

            for (int j = start; j <= end; j++) {
                array[j] += plus;

                if (array[j] >= max) {
                    max = array[j];
                }
            }
        }

        return max;
    }
}
