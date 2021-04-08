package leetcode.sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem1356 {

    /**
     * Problem URL: https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/submissions/
     */
    public int[] sortByBits(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i : arr) {
            int counter = 0;
            int number = i;
            while (number > 0) {
                if (number % 2 != 0) {
                    counter++;
                }
                number /= 2;
            }
            List<Integer> integers = map.getOrDefault(counter, new ArrayList<>());
            integers.add(i);
            map.put(counter, integers);
        }

        int[] result = new int[arr.length];
        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort(Comparator.naturalOrder());
        int index = 0;
        for (Integer key : keys) {
            List<Integer> integerList = map.get(key);
            integerList.sort(Comparator.naturalOrder());
            int size = integerList.size();
            for (int i = index; i < index + size; i++) {
                result[i] = integerList.get(i - index);
            }
            index += size;
        }

        return result;
    }

    /**
     * Author URL: https://leetcode.com/rock/
     * Solution URL: https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/discuss/516985/JavaPython-3-1-liners.
     */
    public int[] bestRatedSolution(int[] arr) {
        Integer[] a = new Integer[arr.length];
        for (int i = 0; i < a.length; ++i) {
            a[i] = arr[i];
        }

        Arrays.sort(a, Comparator.comparing(i -> Integer.bitCount(i) * 10000 + i));
        for (int i = 0; i < a.length; ++i) {
            arr[i] = a[i];
        }

        return arr;
    }

    public int[] bestRatedSolutionOneLine(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.comparingInt(i -> Integer.bitCount(i) * 10000 + i))
                .mapToInt(i -> i)
                .toArray();
    }
}
