import java.util.HashMap;

public class HashMapCollisionDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Two different keys with the same hashcode (rare case)
        map.put("FB", 100);
        map.put("Ea", 200); // These words have the same hashcode in Java

        System.out.println("Value for FB: " + map.get("FB"));
        System.out.println("Value for Ea: " + map.get("Ea"));
    }
}