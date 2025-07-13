 public class PerfectSquare {
    public static void main(String[] args) {
        int n = 49, i = 1;
        while (i * i < n) i++;
        System.out.println(i * i == n ? "Perfect Square" : "Not");
    }
}