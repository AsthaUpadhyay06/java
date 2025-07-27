import java.util.Arrays;

public class ArraysEqualjava {
    public static void main(String[] args) {
        int[] a = {1, 3, 2}, b = {2, 1, 3};
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a, b) ? "Equal Arrays" : "Not Equal");
    }
}