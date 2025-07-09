public class SpyNumber {
    public static void main(String[] args) {
        int num = 1124, sum = 0, prod = 1, temp = num;

        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            prod *= d;
            temp /= 10;
        }

        System.out.println(sum == prod ? "Spy Number" : "Not Spy");
    }
}