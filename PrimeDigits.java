 public class PrimeDigits {
    public static void main(String[] args) {
        int n = 273459;
        System.out.print("Prime digits: ");
        while (n > 0) {
            int d = n % 10;
            if (d == 2 || d == 3 || d == 5 || d == 7)
                System.out.print(d + " ");
            n /= 10;
        }
    }
} 