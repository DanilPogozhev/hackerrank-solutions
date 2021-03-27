package algo;

public class FindEquilibrium {
    public static void main(String[] args) {
        int[] array = {-1, 3, -4, 5, 1, -6, 2, 1};
        System.out.println(find(array));
    }

    private static int find(int[] array) {
        long leftSum = 0;
        long rightSum = 0;

        for (int j : array) {
            rightSum += j;
        }

        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (leftSum == rightSum - array[i]) {
                result = i;
                break;
            }

            leftSum += array[i];
            rightSum -= array[i];
        }

        if (result == -1 && leftSum == 0) {
            result = array.length - 1;
        }

        return result;
    }
}
