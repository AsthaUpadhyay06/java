 public class PrintDescending {
    public static void print(int n) {
        if(n == 0) return;
        System.out.print(n + " ");
        print(n - 1);
    }

    public static void main(String[] args) {
        print(5);  // Output: 5 4 3 2 1
    }
} 