public class PrimeCountInArray {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 10, 11};
        int count = 0;
        for (int num : arr)
            if (isPrime(num)) count++;
        System.out.println("Prime Count: " + count);
    }
}