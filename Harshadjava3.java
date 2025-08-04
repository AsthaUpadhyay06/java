public class Harshadjava3 {
    public static void main(String[] args) {
        int num = 18, sum = 0, n = num;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println((num % sum == 0) ? "Harshad Number" : "Not Harshad");
    }
}