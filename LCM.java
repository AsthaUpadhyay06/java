
    
    public class LCM {
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        int a = 15, b = 20;
        int lcm = (a * b) / gcd(a, b);
        System.out.println("LCM = " + lcm);
    }
}

