 public class MagicNumber {
    static int digitSum(int n) {
        while (n > 9) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

    public static void main(String[] args) {
        int num = 1729;
        System.out.println(digitSum(num) == 1 ? "Magic Number" : "Not Magic");
    }
} 