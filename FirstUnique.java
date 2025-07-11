public class FirstUnique {
    public static void main(String[] args) {
        String s = "aabccdeff";
        int[] count = new int[256];

        for (char ch : s.toCharArray()) count[ch]++;
        for (char ch : s.toCharArray()) {
            if (count[ch] == 1) {
                System.out.println("First unique: " + ch);
                break;
            }
        }
    }
}