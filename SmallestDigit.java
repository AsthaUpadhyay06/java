public class SmallestDigit {
    public static void main(String[] args) {
        int n = 39184, min = 9;
        while (n > 0) {
            min = Math.min(min, n % 10);
            n /= 10;
        }
        System.out.println("Smallest digit: " + min);
    }
} 