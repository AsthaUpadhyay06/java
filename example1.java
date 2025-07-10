 import java.util.HashMap;

public class example1 {
    public static void main(String[] args) {
        HashMap<String, Integer> cart = new HashMap<>();
        cart.put("Apple", 2);
        cart.put("Banana", 3);

        System.out.println("Total Items: " + cart.size());
    }
} 