public class SwapFirstLastDigitjava {
    public static void main(String[] args) {
        int n = 12345;
        String s = String.valueOf(n);
        char[] a = s.toCharArray();
        char temp = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = temp;
        System.out.println("After swap: " + new String(a));
    }
} 