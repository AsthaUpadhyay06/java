 public class DigitFactorialSum {
    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }

    public static void main(String[] args) {
        int n = 123, sum = 0;
        while (n > 0) {
            sum += fact(n % 10);
            n /= 10;
        }
        System.out.println("Sum of factorials: " + sum);
    }
} 