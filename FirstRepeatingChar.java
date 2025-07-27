 public class FirstRepeatingChar {
    public static void main(String[] args) {
        String s = "programming";
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))) {
                System.out.println("First repeating character: " + s.charAt(i));
                found = true;
                break;
            }
        }
        if (!found) System.out.println("No repeating characters.");
    }
}