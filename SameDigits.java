import java.util.Arrays;

public class SameDigits {
    public static void main(String[] args) {
        int a = 1234, b = 4321;
        char[] ch1 = String.valueOf(a).toCharArray();
        char[] ch2 = String.valueOf(b).toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch1, ch2) ? "Same Digits" : "Different Digits");
    }
}