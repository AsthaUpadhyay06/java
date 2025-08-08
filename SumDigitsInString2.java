 public class SumDigitsInString2 {
    public static void main(String[] args) {
        String input = "abc12xy3z";
        int sum = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        System.out.println("Sum of digits: " + sum);
    }
} 