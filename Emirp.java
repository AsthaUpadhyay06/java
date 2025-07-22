public class Emirp {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int count = 0, num = 10;
        while (count < 10) {
            int rev = reverse(num);
            if (isPrime(num) && isPrime(rev) && num != rev) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}