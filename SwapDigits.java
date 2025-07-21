 public class SwapDigits {
    public static void main(String[] args) {
        int num = 12345;
        String s = String.valueOf(num);
        char[] arr = s.toCharArray();
        char temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.println("After swapping: " + new String(arr));
    }
}