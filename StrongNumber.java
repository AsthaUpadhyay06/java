 public class StrongNumber {
    static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        int num = 145, sum = 0, temp = num;

        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }

        System.out.println(num == sum ? "Strong Number" : "Not Strong");
    }
}
