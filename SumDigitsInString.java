public class SumDigitsInString {
    public static void main(String[] args) {
        String s = "a1b2c3";
        int sum = 0;
        for (char ch : s.toCharArray())
            if (Character.isDigit(ch))
                sum += Character.getNumericValue(ch);
        System.out.println("Sum: " + sum);
    }
}
