 import java.util.*;

public class UniqueChars {
    public static void main(String[] args) {
        String s = "abcdefg";
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                System.out.println("Not Unique");
                return;
            }
        }
        System.out.println("All characters are unique");
    }
}
    

