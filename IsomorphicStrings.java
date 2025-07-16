import java.util.*;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "egg", s2 = "add";

        if (s1.length() != s2.length()) {
            System.out.println("Not Isomorphic");
            return;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> mapped = new HashSet<>();

        boolean isomorphic = true;

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    isomorphic = false;
                    break;
                }
            } else {
                if (mapped.contains(c2)) {
                    isomorphic = false;
                    break;
                }
                map.put(c1, c2);
                mapped.add(c2);
            }
        }

        System.out.println(isomorphic ? "Isomorphic" : "Not Isomorphic");
    }
} 