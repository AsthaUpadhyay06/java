 public class PowerSet {
    public static void generateSubsets(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // include current character
        generateSubsets(str, current + str.charAt(index), index + 1);

        // exclude current character
        generateSubsets(str, current, index + 1);
    }

    public static void main(String[] args) {
        generateSubsets("ab", "", 0);
    }
} 