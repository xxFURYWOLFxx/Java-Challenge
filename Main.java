import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        double bank = 0.0;
        String name;

        System.out.println("Welcome to the Store!");
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();

        String[] items = {"Apple", "Banana", "Orange", "Grapes", "Watermelon"};
        double[] prices = {0.50, 0.30, 0.80, 2.00, 1.50};
        int[] inventory = new int[items.length];
        String[] transactionHistory = new String[100];
        int transactionCount = 0;

        while (true) {
            System.out.println("\nHello, " + name + "!");
            System.out.println("1. Cash In");
            System.out.println("2. Cash Out");
            System.out.println("3. Spend Money in the Store");
            System.out.println("4. Sell Items to the Store");
            System.out.println("5. Check Balance");
            System.out.println("6. Check Bank");
            System.out.println("7. View Inventory");
            System.out.println("8. View Transaction History");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to cash in: ");
                double amount = scanner.nextDouble();
                balance += amount;
                transactionHistory[transactionCount++] = "Cashed in $" + amount;
                System.out.println("You have cashed in $" + amount);
            } else if (choice == 2) {
                System.out.print("Enter amount to cash out: ");
                double amount = scanner.nextDouble();
                if (amount <= balance) {
                    balance -= amount;
                    bank += amount;
                    transactionHistory[transactionCount++] = "Cashed out $" + amount;
                    System.out.println("You have cashed out $" + amount);
                } else {
                    System.out.println("Insufficient balance!");
                }
            } else if (choice == 3) {
                System.out.println("Items available in the store:");
                for (int i = 0; i < items.length; i++) {
                    System.out.println((i + 1) + ". " + items[i] + " - $" + prices[i]);
                }
                System.out.print("Select an item to buy: ");
                int itemChoice = scanner.nextInt();
                if (itemChoice > 0 && itemChoice <= items.length) {
                    double price = prices[itemChoice - 1];
                    if (price <= balance) {
                        balance -= price;
                        inventory[itemChoice - 1]++;
                        transactionHistory[transactionCount++] = "Bought " + items[itemChoice - 1] + " for $" + price;
                        System.out.println("You bought " + items[itemChoice - 1] + " for $" + price);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                } else {
                    System.out.println("Invalid choice!");
                }
            } else if (choice == 4) {
                System.out.println("Items available to sell:");
                for (int i = 0; i < items.length; i++) {
                    System.out.println((i + 1) + ". " + items[i] + " - $" + prices[i] + " (You have " + inventory[i] + ")");
                }
                System.out.print("Select an item to sell: ");
                int itemChoice = scanner.nextInt();
                if (itemChoice > 0 && itemChoice <= items.length) {
                    if (inventory[itemChoice - 1] > 0) {
                        double price = prices[itemChoice - 1];
                        balance += price;
                        inventory[itemChoice - 1]--;
                        transactionHistory[transactionCount++] = "Sold " + items[itemChoice - 1] + " for $" + price;
                        System.out.println("You sold " + items[itemChoice - 1] + " for $" + price);
                    } else {
                        System.out.println("You don't have any " + items[itemChoice - 1] + " to sell!");
                    }
                } else {
                    System.out.println("Invalid choice!");
                }
            } else if (choice == 5) {
                System.out.println("Your current balance is $" + balance);
            } else if (choice == 6) {
                System.out.println("Your bank balance is $" + bank);
            } else if (choice == 7) {
                System.out.println("Your inventory:");
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i] + ": " + inventory[i]);
                }
            } else if (choice == 8) {
                System.out.println("Transaction history:");
                for (int i = 0; i < transactionCount; i++) {
                    System.out.println(transactionHistory[i]);
                }
            } else if (choice == 9) {
                System.out.println("Goodbye, " + name + "!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}