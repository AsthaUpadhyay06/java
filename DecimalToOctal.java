public class DecimalToOctal {
    public static void main(String[] args) {
        int num = 83;
        String octal = "";
        while (num > 0) {
            octal = (num % 8) + octal;
            num /= 8;
        }
        System.out.println("Octal: " + octal);
    }
} 