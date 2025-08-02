public class AlternateDigitSum {
    public static void main(String[] args) {
        int n = 123456, i = 0, sum = 0;
        String str = String.valueOf(n);
        while (i < str.length()) {
            sum += Character.getNumericValue(str.charAt(i));
            i += 2;
        }
        System.out.println("Alternate digit sum: " + sum);
    }
}