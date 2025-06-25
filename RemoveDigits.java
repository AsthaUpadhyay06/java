 public class RemoveDigits {
    public static void main(String[] args) {
        String str = "H3ll0 W0rld 2025!";
        String result = "";

        for(char ch : str.toCharArray()) {
            if(!Character.isDigit(ch)) {
                result += ch;
            }
        }

        System.out.println("After removing digits: " + result);
    }
}