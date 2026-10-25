import java.util.Scanner;

public class WarehouseInventoryScanner {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] shelves = {
            {20, 15, -1, 8},
            {12, -1, 3, 30},
            {7, 25, 18, -1}
        };

        int choice;
        do {
            System.out.println();
            System.out.println("1 - Total inventory");
            System.out.println("2 - Find low stock shelf");
            System.out.println("3 - Restock");
            System.out.println("4 - Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            if (choice == 1) {
                getTotal(shelves);
            } else if (choice == 2) {
                findLow(shelves);
            } else if (choice == 3) {
                restock(shelves);
            } else if (choice != 4) {
                System.out.println("Invalid choice");
            }
        } while (choice != 4);

        System.out.println("Bye!");
    }

    static void getTotal(int[][] shelves) {
        int total = 0;
        for (int i = 0; i < shelves.length; i++) {
            for (int j = 0; j < shelves[i].length; j++) {
                if (shelves[i][j] == -1) {
                    continue;
                }
                total += shelves[i][j];
            }
        }
        System.out.println("Total items: " + total);
    }

    static void findLow(int[][] shelves) {
        boolean found = false;
        for (int i = 0; i < shelves.length; i++) {
            for (int j = 0; j < shelves[i].length; j++) {
                if (shelves[i][j] != -1 && shelves[i][j] < 5) {
                    System.out.println("Low stock at row " + i + " column " + j + " (" + shelves[i][j] + " left)");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("No low stock shelves");
        }
    }

    static void restock(int[][] shelves) {
        System.out.print("Row: ");
        int row = sc.nextInt();
        System.out.print("Column: ");
        int col = sc.nextInt();

        if (row < 0 || row >= shelves.length || col < 0 || col >= shelves[row].length) {
            System.out.println("That shelf doesn't exist");
            return;
        }
        if (shelves[row][col] == -1) {
            System.out.println("That shelf is damaged");
            return;
        }

        System.out.print("How many to add? ");
        int amount = sc.nextInt();
        while (amount <= 0 || amount > 100) {
            System.out.print("Please enter 1 to 100 only: ");
            amount = sc.nextInt();
        }

        shelves[row][col] += amount;
        System.out.println("Shelf now has " + shelves[row][col]);
    }
}
