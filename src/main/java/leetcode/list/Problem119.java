package leetcode.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem119 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return Collections.singletonList(1);
        }

        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(1);
        if (rowIndex == 1) {
            return temp;
        }

        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 0; j < temp.size() - 1; j++) {
                list.add(temp.get(j) + temp.get(j + 1));
            }
            list.add(1);
            temp = list;
        }

        return temp;
    }
}
