import java.util.Scanner;

public class indexes {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {5, 6, 3, 2, 8};

        System.out.print("Enter starting index (l): ");
        int l = sc.nextInt();

        System.out.print("Enter ending index (r): ");
        int r = sc.nextInt();

        int sum = 0;

        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }

        System.out.println("Sum from index " + l + " to " + r + " is: " + sum);
    }
}

