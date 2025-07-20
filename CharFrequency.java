 import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        String s = "hellojava";
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray())
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

        for (char ch : freq.keySet())
            System.out.println(ch + " → " + freq.get(ch));
    }
} 
