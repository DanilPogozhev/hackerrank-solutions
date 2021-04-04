package leetcode.sortings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : nums1) {
            int frequency = map.getOrDefault(j, 0);
            map.put(j, frequency + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int j : nums2) {
            if (map.get(j) != null && map.get(j) > 0) {
                map.put(j, map.get(j) - 1);
                result.add(j);
            }
        }

        int[] arr = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }

        return arr;
    }
}
