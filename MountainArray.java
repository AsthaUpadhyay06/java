public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};
        int i = 0;
        while (i + 1 < arr.length && arr[i] < arr[i + 1]) i++;
        if (i == 0 || i == arr.length - 1) {
            System.out.println("Not a Mountain Array");
            return;
        }
        while (i + 1 < arr.length && arr[i] > arr[i + 1]) i++;
        System.out.println(i == arr.length - 1 ? "Mountain Array" : "Not");
    }
}