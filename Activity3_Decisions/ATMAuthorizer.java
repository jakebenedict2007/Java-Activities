public class ATMAuthorizer {
    public static void main(String[] args) {
        String user = "juan";
        int pin = 4821;

        String inputUser = "juan";
        int inputPin = 4821;
        double balance = 25000;
        double withdraw = 8000;

        if (inputUser.equals(user) && inputPin >= 1000 && inputPin <= 9999) {
            if (inputPin == pin) {
                String tier;
                if (balance >= 100000) {
                    tier = "Platinum";
                } else if (balance >= 50000) {
                    tier = "Gold";
                } else if (balance >= 10000) {
                    tier = "Silver";
                } else {
                    tier = "Bronze";
                }

                double fee;
                double limit;
                switch (tier) {
                    case "Platinum":
                        fee = 0;
                        limit = 100000;
                        break;
                    case "Gold":
                        fee = 0.005;
                        limit = 50000;
                        break;
                    case "Silver":
                        fee = 0.01;
                        limit = 20000;
                        break;
                    default:
                        fee = 0.02;
                        limit = 10000;
                        break;
                }

                double total = withdraw + (withdraw * fee);
                System.out.println("Account tier: " + tier);

                if (total <= balance) {
                    if (withdraw <= limit) {
                        System.out.println("APPROVED");
                        System.out.println("New balance: " + (balance - total));
                    } else {
                        System.out.println("DENIED - over your daily limit of " + limit);
                    }
                } else {
                    System.out.println("DENIED - not enough balance");
                }
            } else {
                System.out.println("DENIED - wrong PIN");
            }
        } else {
            System.out.println("DENIED - invalid username or PIN");
        }
    }
}
