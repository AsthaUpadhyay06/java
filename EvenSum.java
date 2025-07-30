 public class EvenSum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 9, 4, 1};
        int sum = 0;
        for (int n : arr) {
            if (n % 2 == 0) sum += n;
        }
        System.out.println("Even sum: " + sum);
    }
}