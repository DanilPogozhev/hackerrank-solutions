package leetcode.sortings;

import java.util.Arrays;

public class Problem976 {
    /**
     * Problem URL: https://leetcode.com/problems/largest-perimeter-triangle/
     */
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int maxIndex = nums.length - 1;
        while (maxIndex >= 2) {
            int a = nums[maxIndex];
            int b = nums[maxIndex - 1];
            int c = nums[maxIndex - 2];

            if (isPossible(a, b, c)) {
                return a + b + c;
            } else {
                maxIndex--;
            }
        }

        return 0;
    }

    private boolean isPossible(int a, int b, int c) {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }

    /**
     * Author URL: https://leetcode.com/lee215/
     * Solution URL: https://leetcode.com/problems/largest-perimeter-triangle/discuss/217988/JavaC%2B%2BPython-Sort-and-Try-Biggest
     */
    public int bestRatedSolution(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 1; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        return 0;
    }
}
