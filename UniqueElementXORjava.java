 public class UniqueElementXORjava {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1}; // Example array
        int unique = 0;

        for (int num : numbers) {
            unique ^= num; // XOR operation
        }

        System.out.println("Unique element: " + unique);
    }
}


      