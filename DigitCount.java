public class DigitCount {
    public static void main(String[] args) {
        int num = 123456789;
        int digits = (int) Math.log10(num) + 1;

        System.out.println("Digits: " + digits);
    }
} 