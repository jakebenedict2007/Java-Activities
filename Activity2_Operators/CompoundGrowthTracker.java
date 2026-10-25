public class CompoundGrowthTracker {
    public static void main(String[] args) {
        double balance = 1000;
        System.out.println("Starting balance: " + balance);

        balance += 500;
        System.out.println("Week 1: " + balance);
        balance *= 1.05;
        System.out.println("Week 2: " + balance);
        balance += 250;
        System.out.println("Week 3: " + balance);

        int count = 5;
        System.out.println(count++);
        System.out.println(count);

        System.out.println(++count);
        System.out.println(count);
    }
}
