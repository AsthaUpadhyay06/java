 public class KaprekarNumber {
    public static void main(String[] args) {
        int num = 45;
        int sq = num * num;
        String s = String.valueOf(sq);
        for (int i = 1; i < s.length(); i++) {
            int left = Integer.parseInt(s.substring(0, i));
            int right = Integer.parseInt(s.substring(i));
            if (right != 0 && left + right == num) {
                System.out.println(num + " is a Kaprekar Number");
                return;
            }
        }
        System.out.println(num + " is not a Kaprekar Number");
    }
} 