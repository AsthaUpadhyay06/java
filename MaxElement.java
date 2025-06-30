 public class MaxElement {
    public static int findMax(int[] arr, int index) {
        if (index == arr.length - 1) return arr[index];

        int maxRest = findMax(arr, index + 1);
        return Math.max(arr[index], maxRest);
    }

    public static void main(String[] args) {
        int[] arr = {12, 7, 90, 33, 67};
        System.out.println("Max: " + findMax(arr, 0));
    }
}