
    public class FirstNonRepeatingjava {
    public static void main(String[] args) {
        String str = "aabbcdeff";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating: " + ch);
                return;
            }
        }
        System.out.println("No unique character found");
    }
}
