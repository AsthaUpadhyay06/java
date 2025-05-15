 public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Access and print array elements
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Modify an array element
        numbers[2] = 100;
        System.out.println("Modified array:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
} 