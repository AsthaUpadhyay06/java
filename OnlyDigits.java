public class OnlyDigits {
    public static void main(String[] args) {
        String str = "123456";

        boolean allDigits = true;
        for(char ch : str.toCharArray()) {
            if(!Character.isDigit(ch)) {
                allDigits = false;
                break;
            }
        }

        System.out.println(allDigits ? "Only digits" : "Contains non-digit characters");
    }
}
