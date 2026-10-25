public class PrecedencePuzzleSolver {
    public static void main(String[] args) {
        int x = 4;
        int y = 10;

        boolean ans1 = x + y * 2 > 20;
        System.out.println("Answer 1: " + ans1);

        boolean ans2 = x > 5 || y < 20 && x == 4;
        System.out.println("Answer 2: " + ans2);

        int ans3 = x++ * 2 + y % 3;
        System.out.println("Answer 3: " + ans3);

        int ans4 = --y - x / 2;
        System.out.println("Answer 4: " + ans4);
    }
}
