 public class CountPrimesjava {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 50; i++)
            if (isPrime(i)) count++;
        System.out.println("Total primes from 1 to 50: " + count);
    }
} 
