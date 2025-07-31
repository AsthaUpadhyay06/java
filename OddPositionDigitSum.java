 public class OddPositionDigitSum {
    public static void main(String[] args) {
        int num = 1234567, pos = 1, sum = 0;
        while (num > 0) {
            if (pos % 2 != 0)
                sum += num % 10;
            num /= 10;
            pos++;
        }
        System.out.println("Sum of odd-position digits: " + sum);
    }
} 