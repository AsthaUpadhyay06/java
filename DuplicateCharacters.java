 public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        int[] freq = new int[256];

        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        System.out.println("Duplicate characters:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                System.out.println((char)i + " → " + freq[i]);
            }
        }
    }
} 