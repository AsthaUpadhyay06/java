 public class FactorialRecjava {
    static int fact(int n) {
        return (n <= 1) ? 1 : n * fact(n - 1);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Factorial: " + fact(n));
    }
} 