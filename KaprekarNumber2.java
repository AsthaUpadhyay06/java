public class KaprekarNumber2 {
    public static void main(String[] args) {
        int num = 45;
        int square = num * num;
        String str = String.valueOf(square);
        int len = str.length();

        for (int i = 1; i < len; i++) {
            int left = Integer.parseInt(str.substring(0, i));
            int right = Integer.parseInt(str.substring(i));
            if (left + right == num) {
                System.out.println(num + " is a Kaprekar Number");
                return;
            }
        }
        System.out.println(num + " is NOT a Kaprekar Number");
    }
}