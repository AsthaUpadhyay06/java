 import java.util.*;

public class CharFrequencyjava {
    public static void main(String[] args) {
        String s = "Java is Awesome".replaceAll(" ", "").toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (var e : map.entrySet())
            System.out.println(e.getKey() + " : " + e.getValue());
    }
}
