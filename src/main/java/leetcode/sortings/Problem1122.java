package leetcode.sortings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1122 {

    /**
     * Problem URL: https://leetcode.com/problems/relative-sort-array/
     */
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : arr1) {
            int frequency = map.getOrDefault(j, 0);
            map.put(j, frequency + 1);
        }

        int[] array = new int[arr1.length];
        int index = 0;
        for (int i : arr2) {
            int k = map.get(i);
            for (int j = index; j < index + k; j++) {
                array[j] = i;
            }
            map.remove(i);
            index += k;
        }

        if (!map.isEmpty()) {
            List<Integer> notRemoved = new ArrayList<>();
            map.keySet().forEach(key -> {
                for (int i = 0; i < map.get(key); i++) {
                    notRemoved.add(key);
                }
            });

            notRemoved.sort(Comparator.naturalOrder());

            for (int i = index; i < array.length; i++) {
                array[i] = notRemoved.get(i - index);
            }
        }

        return array;
    }

    /**
     * Author URL: https://leetcode.com/motorix/
     * Solution URL: https://leetcode.com/problems/relative-sort-array/discuss/335056/Java-in-place-solution-using-counting-sort
     */
    public int[] bestRatedSolution(int[] arr1, int[] arr2) {
        int[] cnt = new int[1001];
        for (int n : arr1) cnt[n]++;
        int i = 0;
        for (int n : arr2) {
            while (cnt[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        for (int n = 0; n < cnt.length; n++) {
            while (cnt[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        return arr1;
    }
}
