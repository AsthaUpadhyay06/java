 public class PerfectSquares {
    public static void main(String[] args) {
        int start = 1, end = 100;
        for (int i = start; i <= end; i++) {
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i)
                System.out.print(i + " ");
        }
    }
}