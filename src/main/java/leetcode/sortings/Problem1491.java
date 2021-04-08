package leetcode.sortings;

public class Problem1491 {

    /**
     * Problem URL: https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
     */
    public double average(int[] salary) {
        int max = -1;
        int min = 1000001;

        int sum = 0;
        for (int i : salary) {
            if (i < min) {
                min = i;
            }

            if (i > max) {
                max = i;
            }

            sum += i;
        }

        sum -= min;
        sum -= max;

        return (double) sum / (salary.length - 2);
    }
}
