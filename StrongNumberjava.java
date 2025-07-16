 public class StrongNumberjava {
    static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        int n = 145, sum = 0, t = n;
        while (t > 0) {
            sum += fact(t % 10);
            t /= 10;
        }
        System.out.println(n == sum ? "Strong Number" : "Not");
    }
} 
