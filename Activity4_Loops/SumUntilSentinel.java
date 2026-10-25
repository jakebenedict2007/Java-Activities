import java.util.Scanner;

public class SumUntilSentinel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter a number (-1 to stop): ");
        int num = sc.nextInt();

        while (num != -1) {
            sum += num;
            System.out.print("Enter a number (-1 to stop): ");
            num = sc.nextInt();
        }

        System.out.println("Total: " + sum);
    }
}
