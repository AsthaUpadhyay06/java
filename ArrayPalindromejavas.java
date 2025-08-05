 public class ArrayPalindromejavas {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        boolean isPalin = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPalin = false;
                break;
            }
        }
        System.out.println(isPalin ? "Palindrome Array" : "Not Palindrome");
    }
}