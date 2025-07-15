 public class DigitProductjava {
    public static void main(String[] args) {
        int n = 231, prod = 1;
        while (n > 0) {
            prod *= n % 10;
            n /= 10;
        }
        System.out.println("Product: " + prod);
    }
} 