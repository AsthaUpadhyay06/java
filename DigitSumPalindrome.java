 public class DigitSumPalindrome {
    public static void main(String[] args) {
        int n = 12521, sum = 0, temp;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        temp = sum;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println(sum == rev ? "Sum is Palindrome" : "Not Palindrome");
    }
} 