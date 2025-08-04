public class ManualSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2};
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
        for (int n : arr) System.out.print(n + " ");
    }
}
