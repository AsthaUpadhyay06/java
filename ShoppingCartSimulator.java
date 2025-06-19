import java.util.*;

public class ShoppingCartSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> cart = new LinkedHashMap<>();

        int choice;
        do {
            System.out.println("\n===== SHOPPING CART MENU =====");
            System.out.println("1. Add Item");
            System.out.println("2. View Cart");
            System.out.println("3. Remove Item");
            System.out.println("4. View Total");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String item = sc.nextLine();
                    System.out.print("Enter price: ₹");
                    double price = sc.nextDouble();
                    cart.put(item, price);
                    System.out.println(item + " added to cart.");
                    break;

                case 2:
                    if (cart.isEmpty()) {
                        System.out.println("🛒 Your cart is empty.");
                    } else {
                        System.out.println("🧾 Items in your cart:");
                        for (Map.Entry<String, Double> entry : cart.entrySet()) {
                            System.out.println("- " + entry.getKey() + " : ₹" + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter item name to remove: ");
                    String removeItem = sc.nextLine();
                    if (cart.containsKey(removeItem)) {
                        cart.remove(removeItem);
                        System.out.println(removeItem + " removed from cart.");
                    } else {
                        System.out.println("Item not found in cart.");
                    }
                    break;

                case 4:
                    double total = 0;
                    for (double val : cart.values()) {
                        total += val;
                    }
                    System.out.println("💰 Total Amount: ₹" + total);
                    break;

                case 5:
                    System.out.println("Thank you for shopping! 🛍");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
} 