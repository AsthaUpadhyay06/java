 import java.util.HashMap;

public class Productmanagement
 {
    public static void main(String[] args) {
        HashMap<String, Product> products = new HashMap<>();
        products.put("Milk", new Product("Milk", 50.0, 2));
        products.put("Bread", new Product("Bread", 20.0, 3));

        double totalPrice = 0;
        for (Product product : products.values()) {
            totalPrice += product.getPrice() * product.getQuantity();
        }

        System.out.println("Total Price: " + totalPrice);
    }
}

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
} 