 import java.util.*;

public class HashMapExamplejava {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Ravi", 85);
        marks.put("Anita", 90);
        marks.put("Kiran", 78);

        for (String name : marks.keySet()) {
            System.out.println(name + " -> " + marks.get(name));
        }
    }
} 
