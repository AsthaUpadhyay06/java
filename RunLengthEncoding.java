 public class RunLengthEncoding {
    public static void main(String[] args) {
        String str = "aaabbbccaaa";
        StringBuilder encoded = new StringBuilder();

        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) count++;
            else {
                encoded.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        encoded.append(str.charAt(str.length() - 1)).append(count);
        System.out.println("Encoded: " + encoded);
    }
} 