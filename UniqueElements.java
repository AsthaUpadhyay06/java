public class UniqueElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        System.out.println("Unique elements:");
        for (int i = 0; i < numbers.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

        

    

