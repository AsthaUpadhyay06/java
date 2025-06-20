 public class LeadersInArray {
    public static void printLeaders(int[] arr) {
        int n = arr.length;
        int maxFromRight = arr[n - 1];

        System.out.print("Leaders in array: ");
        System.out.print(maxFromRight + " "); // last element is always leader

        // Traverse from second last to beginning
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        printLeaders(arr);
    }
}