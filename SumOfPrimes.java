 public class SumOfPrimes {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7};
        int sum = 0;
        for (int n : arr)
            if (isPrime(n)) sum += n;

        System.out.println("Sum of primes: " + sum);
    }
}