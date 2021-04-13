package leetcode.arrays;

public class Problem1299 {
    /**
     * Problem URL: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
     */
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i + 1];
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }

            arr[i] = max;
        }

        arr[arr.length - 1] = -1;

        return arr;
    }


    /**
     * Author URL: https://leetcode.com/lee215/
     * Solution URL: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/discuss/463249/JavaC%2B%2BPython-Straight-Forward
     */
    public int[] bestRatedSolution(int[] A) {
        for (int i = A.length - 1, mx = -1; i >= 0; --i)
            mx = Math.max(A[i], A[i] = mx);
        return A;
    }

}