 public class Disarium {
    public static void main(String[] args) {
        int num = 135, sum = 0, temp = num;
        int len = String.valueOf(num).length();

        for (int i = len; i >= 1; i--) {
            int digit = temp % 10;
            sum += Math.pow(digit, i);
            temp /= 10;
        }

        System.out.println(num == sum ? "Disarium" : "Not");
    }
}