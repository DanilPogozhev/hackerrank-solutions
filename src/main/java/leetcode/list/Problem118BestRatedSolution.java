package leetcode.list;

import java.util.ArrayList;
import java.util.List;

/*
 * Not mine.
 * Solution URL: https://leetcode.com/problems/pascals-triangle/discuss/38141/My-concise-solution-in-Java/36127
 * Author URL:   https://leetcode.com/meganlee/
 */
public class Problem118BestRatedSolution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> row = new ArrayList();
        for (int i = 0; i < numRows; i++) {
            for (int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
            res.add(new ArrayList(row));
        }
        return res;
    }
}
