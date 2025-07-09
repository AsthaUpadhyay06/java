import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "java is easy java is powerful";
        String[] words = text.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}