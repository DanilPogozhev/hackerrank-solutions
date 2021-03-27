package algo;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static Map<Integer, Long> map = new HashMap<>();

    static {
        map.put(1, 0L);
        map.put(2, 1L);
        map.put(3, 1L);
    }

    public static void main(String[] args) {
        System.out.println(getFib(45));

        System.out.println(getFibWithMemory(45));
    }

    private static long getFib(int n) {
        if (n == 1) {
            return 0;
        }

        if (n <= 3) {
            return 1;
        }

        return getFib(n - 1) + getFib(n - 2);
    }

    private static long getFibWithMemory(int n) {
        if (!map.containsKey(n)) {
            map.put(n, getFibWithMemory(n - 1) + getFibWithMemory(n - 2));
        }
        return map.get(n);
    }

}
