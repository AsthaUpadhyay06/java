 public class ClimbStairs {
    public static int countWays(int n) {
        if (n == 0) return 1; // reached top
        if (n < 0) return 0;  // invalid

        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        int steps = 4;
        System.out.println("Total ways: " + countWays(steps));
    }
} 
