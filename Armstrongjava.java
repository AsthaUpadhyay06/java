public class Armstrongjava {
    public static void main(String[] args) {
        int n = 153, d, sum = 0, t = n;
        while (t > 0) { d = t % 10; sum += d * d * d; t /= 10; }
        System.out.println(n == sum ? "Armstrong" : "Not");
    }
}