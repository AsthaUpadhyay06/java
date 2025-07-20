 import java.util.*;

public class FirstUniqueCharjava {
    public static void main(String[] args) {
        String s = "aabccdeff";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : s.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First unique char: " + entry.getKey());
                break;
            }
        }
    }
}