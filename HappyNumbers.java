public class HappyNumbers {
    static boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int N = 100, sum = 0;
        for (int i = 1; i <= N; i++)
            if (isHappy(i)) sum += i;
        System.out.println("Sum of Happy Numbers <= 100: " + sum);
    }
}