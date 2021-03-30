package leetcode.arrays;

public class Problem53 {

    /*
     * Solution written after discussion section was visited.
     * Author URL: https://leetcode.com/cbmbbz/
     */
    public int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int transitionalMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            transitionalMax = Math.max(transitionalMax + nums[i], nums[i]);
            currentMax = Math.max(currentMax, transitionalMax);
        }

        return currentMax;
    }
}
