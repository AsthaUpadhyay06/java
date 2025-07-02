 import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Step 1: Convert to lowercase and char arrays
        char[] a = str1.toLowerCase().toCharArray();
        char[] b = str2.toLowerCase().toCharArray();

        // Step 2: Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Step 3: Compare sorted arrays
        if (Arrays.equals(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
} 