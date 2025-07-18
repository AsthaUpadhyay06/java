 public class CountSetBits {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int x = i;
            while (x > 0) {
                count += x & 1;
                x >>= 1;
            }
        }

        System.out.println("Total set bits from 1 to " + n + " = " + count);
    }
} 