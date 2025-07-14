public class Harshadjava {
    public static void main(String[] args) {
        int n = 18, sum = 0, t = n;
        while (t > 0) { sum += t % 10; t /= 10; }
        System.out.println(n % sum == 0 ? "Harshad Number" : "Not Harshad");
    }
}