 public class RemoveConsecDuplicatesjava {
    public static void main(String[] args) {
        String input = "aaabbccdee";
        StringBuilder result = new StringBuilder();
        char prev = 0;

        for (char c : input.toCharArray()) {
            if (c != prev) result.append(c);
            prev = c;
        }
        System.out.println("Result: " + result);
    }
} 