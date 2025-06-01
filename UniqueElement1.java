public class UniqueElement1 {
    
    public static void findUniqueElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            // Compare with every other element
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println("Unique element: " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 5, 3};
        findUniqueElements(arr);  // Output: 4 and 5
    }
}

