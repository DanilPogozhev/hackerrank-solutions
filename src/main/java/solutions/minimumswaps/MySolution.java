package solutions.minimumswaps;

public class MySolution {
    static int minimumSwaps(int[] arr) {
        int swaps = 0;

        while (true) {
            int toTheLeft = -1;
            int toTheRight = -1;
            int shift = arr.length;

            for (int i = 0; i < arr.length; i++) {
                int shiftingValue = arr[i] - i - 1;
                if (shiftingValue == 0) {
                    continue;
                }

                if (shiftingValue > 0) {
                    int elementToChange = i + shiftingValue;
                    int difference = shiftingValue + (arr[elementToChange] - shiftingValue - i - 1);

                    if (difference < shift && difference >= 0) {
                        toTheRight = i;
                        toTheLeft = elementToChange;
                        break;
                    }
                }
            }

            if (toTheLeft == -1) {
                break;
            }

            int temp = arr[toTheRight];
            arr[toTheRight] = arr[toTheLeft];
            arr[toTheLeft] = temp;

            swaps++;
        }

        return swaps;
    }
}
