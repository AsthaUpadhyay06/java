public class SecondLargest1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 25, 15};
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }

        System.out.println("Second largest: " + second);
    }
}