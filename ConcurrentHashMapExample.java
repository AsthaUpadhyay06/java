 import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.put("Apple", 50);
        concurrentMap.put("Banana", 30);
        concurrentMap.put("Cherry", 20);

        System.out.println("ConcurrentHashMap: " + concurrentMap);
    }
}