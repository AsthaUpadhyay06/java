import java.util.Arrays;

public class ArraysEqual {
    public static void main(String[] args) {
        int[] a = {3, 1, 2}, b = {2, 3, 1};
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b) ? "Equal Arrays" : "Not Equal");
    }
}