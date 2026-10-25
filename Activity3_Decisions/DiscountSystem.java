public class DiscountSystem {
    public static void main(String[] args) {
        double purchaseAmount = 3500;
        double discount;
        String tier;

        if (purchaseAmount >= 5000) {
            discount = 0.15;
            tier = "15%";
        } else if (purchaseAmount >= 3000) {
            discount = 0.10;
            tier = "10%";
        } else if (purchaseAmount >= 1000) {
            discount = 0.05;
            tier = "5%";
        } else {
            discount = 0;
            tier = "0%";
        }

        double finalPrice = purchaseAmount - (purchaseAmount * discount);

        System.out.println("Discount: " + tier);
        System.out.println("You will pay: " + finalPrice);
    }
}
