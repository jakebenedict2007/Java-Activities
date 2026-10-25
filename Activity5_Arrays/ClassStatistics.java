public class ClassStatistics {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 64, 99, 71, 88, 90};
        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        double avg = (double) sum / scores.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);
    }
}
