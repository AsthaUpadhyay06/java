public class array9 {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the array elements
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Modify an element
        numbers[2] = 99;

        // Print the modified array
        System.out.println("\nModified array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}