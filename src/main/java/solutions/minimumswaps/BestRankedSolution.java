package solutions.minimumswaps;

public class BestRankedSolution {

    static int minimumSwaps(int[] arr) {
        int swaps = 0;
        int i = 0;

        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;

                swaps++;
            } else {
                i++;
            }
        }

        return swaps;
    }
}
