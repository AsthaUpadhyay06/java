import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Alice", 30);
        System.out.println(map.get("John")); // Output: 25
    }
}