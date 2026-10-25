import java.util.Arrays;

public class SearchSortTool {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 64, 99, 71, 88, 90};
        int target = 99;
        int index = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println(target + " was not found");
        } else {
            System.out.println(target + " was found at index " + index);
        }

        int[] copy = scores.clone();
        Arrays.sort(copy);

        System.out.println("Original: " + Arrays.toString(scores));
        System.out.println("Sorted: " + Arrays.toString(copy));
    }
}
