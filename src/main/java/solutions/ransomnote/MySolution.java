package solutions.ransomnote;

import java.util.HashMap;
import java.util.Map;

public class MySolution {

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineMap = new HashMap<>();
        fillMap(magazineMap, magazine);

        boolean couldBe = true;
        for (String key : note) {
            Integer integer = magazineMap.get(key);
            if (integer == null || integer == 0) {
                couldBe = false;
                break;
            } else {
                magazineMap.put(key, integer - 1);
            }
        }

        if (couldBe) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static void fillMap(Map<String, Integer> map, String[] array) {
        for (String word : array) {
            if (map.containsKey(word)) {
                int number = map.get(word);
                number += 1;
                map.put(word, number);
            } else {
                map.put(word, 1);
            }
        }
    }
}
