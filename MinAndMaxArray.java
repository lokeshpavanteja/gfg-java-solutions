
import java.util.*;

public class MinAndMaxArray {

    public static ArrayList<Integer> getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 8, 6};

        ArrayList<Integer> result = getMinMax(arr);

        System.out.println("Minimum element: " + result.get(0));
        System.out.println("Maximum element: " + result.get(1));
    }
}
