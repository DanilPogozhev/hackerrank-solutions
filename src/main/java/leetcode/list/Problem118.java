package leetcode.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(1));

        if (numRows == 1) {
            return result;
        }

        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        result.add(second);

        if (numRows == 2) {
            return result;
        }

        List<Integer> temp = second;
        for (int i = 3; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();

            list.add(1);
            for (int j = 0; j < temp.size() - 1; j++) {
                list.add(temp.get(j) + temp.get(j + 1));
            }
            list.add(1);
            result.add(list);

            temp = list;
        }

        return result;
    }
}
