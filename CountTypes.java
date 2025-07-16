 public class CountTypes {
    public static void main(String[] args) {
        String s = "Astha123@Java!";
        int lower = 0, upper = 0, digit = 0, special = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) lower++;
            else if (Character.isUpperCase(ch)) upper++;
            else if (Character.isDigit(ch)) digit++;
            else special++;
        }

        System.out.println("Lower: " + lower + ", Upper: " + upper + ", Digits: " + digit + ", Special: " + special);
    }
} 