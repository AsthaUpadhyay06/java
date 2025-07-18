import java.util.*;

public class FirstNonRepeatingjava2 {
    public static void main(String[] args) {
        String str = "swiss";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating: " + entry.getKey());
                return;
            }
        }
        System.out.println("No non-repeating character");
    }
}
    

