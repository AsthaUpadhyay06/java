public public class DuplicateElements2 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 3, 2, 4, 5};
        System.out.print("Duplicates: ");
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j])
                    System.out.print(arr[i] + " ");
    }
} 
