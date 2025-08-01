public class DigitalRoot {
    public static void main(String[] args) {
        int n = 9876;
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        System.out.println("Digital Root: " + n);
    }
}