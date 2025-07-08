 public class MaxOccurringChar {
    public static void main(String[] args) {
        String str = "successes";
        int[] freq = new int[256];
        char maxChar = ' ';
        int max = 0;

        for (char c : str.toCharArray()) {
            freq[c]++;
            if (freq[c] > max) {
                max = freq[c];
                maxChar = c;
            }
        }

        System.out.println("Max occurring char: " + maxChar);
    }
} 