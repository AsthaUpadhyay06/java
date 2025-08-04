 public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "aabccbd";
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println("First non-repeated: " + c);
                break;
            }
        }
    }
} 