import java.util.HashMap;

 class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Cherry", 10);

        // Retrieving values
        System.out.println("Apple quantity: " + map.get("Apple"));

        // Checking if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana is present.");
        }

        // Iterating through the map
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Removing an item
        map.remove("Cherry");

        // Displaying final map
        System.out.println("Updated map: " + map);
    }
}