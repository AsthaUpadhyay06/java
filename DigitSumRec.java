public class DigitSumRec {
    static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Digit sum: " + sumDigits(num));
    }
}