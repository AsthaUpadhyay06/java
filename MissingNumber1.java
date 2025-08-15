 public class MissingNumber1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1; // including missing
        int sum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr)
            actualSum += num;

        System.out.println("Missing number: " + (sum - actualSum));
    }
} 