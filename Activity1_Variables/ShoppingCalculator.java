public class ShoppingCalculator {
    public static void main(String[] args) {
        String storeName = "7-Eleven";
        int quantity = 3;
        double unitPrice = 49.75;

        double totalCost = quantity * unitPrice;

        System.out.println("Store: " + storeName);
        System.out.println("Qty: " + quantity);
        System.out.println("Price each: " + unitPrice);
        System.out.println("Total: " + totalCost);
    }
}
