public class PrimeInRange {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }
} 