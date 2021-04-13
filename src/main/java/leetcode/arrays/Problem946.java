package leetcode.arrays;

public class Problem946 {
    /**
     * Problem URL: https://leetcode.com/problems/valid-mountain-array/
     */
    public boolean validMountainArray(int[] arr) {
        boolean up = false;
        boolean down = false;

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i] - arr[i - 1];

            if (!up) {
                if (temp <= 0) {
                    return false;
                } else {
                    up = true;
                }
            } else {
                if (down && temp >= 0 || temp == 0) {
                    return false;
                }

                if (temp < 0) {
                    down = true;
                }
            }
        }

        return down;
    }

    /**
     * Author URL: https://leetcode.com/lee215/
     * Solution URL: https://leetcode.com/problems/valid-mountain-array/discuss/194900/C%2B%2BJavaPython-Climb-Mountain
     */
    public boolean bestRatedSolution(int[] A) {
        int n = A.length, i = 0, j = n - 1;
        while (i + 1 < n && A[i] < A[i + 1]) i++;
        while (j > 0 && A[j - 1] > A[j]) j--;
        return i > 0 && i == j && j < n - 1;
    }
}
