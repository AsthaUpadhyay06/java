 public class Fibonacci {
    public static void main(String[] args) {
        int n = 7, a = 0, b = 1;
        System.out.print("Fibonacci: " + a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
} 