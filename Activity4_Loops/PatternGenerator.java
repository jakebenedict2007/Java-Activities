public class PatternGenerator {
    public static void main(String[] args) {
        int size = 7;

        for (int i = 1; i <= size; i++) {
            if (i == 4) {
                continue;
            }
            for (int j = 1; j <= i; j++) {
                if (j == 6) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
