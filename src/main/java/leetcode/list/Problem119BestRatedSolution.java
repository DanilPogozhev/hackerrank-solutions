package leetcode.list;

import java.util.Arrays;
import java.util.List;

/*
 * Not mine.
 * Solution URL: https://leetcode.com/problems/pascals-triangle-ii/discuss/38584/Another-accepted-Java-solution
 * Author URL:   https://leetcode.com/jeantimex/
 */
public class Problem119BestRatedSolution {
    public List<Integer> getRow(int k) {
        Integer[] arr = new Integer[k + 1];
        Arrays.fill(arr, 0);
        arr[0] = 1;

        for (int i = 1; i <= k; i++)
            for (int j = i; j > 0; j--)
                arr[j] = arr[j] + arr[j - 1];

        return Arrays.asList(arr);
    }
}
