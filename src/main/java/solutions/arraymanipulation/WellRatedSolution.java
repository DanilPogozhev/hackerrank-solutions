package solutions.arraymanipulation;

public class WellRatedSolution {
    static long arrayManipulation(int n, int[][] queries) {
        int[] array = new int[n + 1];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0] - 1;
            int end = queries[i][1];
            int plus = queries[i][2];

            array[start] += plus;
            array[end] -= plus;
        }

        long sum = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
            max = Math.max(max, sum);
        }

        return max;
    }
}
