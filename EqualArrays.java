
    import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3}, b = {1, 2, 3};

        if (Arrays.equals(a, b))
            System.out.println("Arrays are equal");
        else
            System.out.println("Arrays are not equal");
    }
}

