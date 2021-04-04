package leetcode.sortings;

/**
 * Problem URL: https://leetcode.com/problems/sort-array-by-parity-ii/
 */
public class Problem922 {
    public int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];

        int even = 0;
        int odd = 1;
        for (int number : nums) {
            if (number % 2 == 0) {
                result[even] = number;
                even += 2;
            } else {
                result[odd] = number;
                odd += 2;
            }
        }
        return result;
    }
}
