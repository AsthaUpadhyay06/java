public class DecimalToHex {
    public static void main(String[] args) {
        int num = 2545;
        String hex = Integer.toHexString(num).toUpperCase();
        System.out.println("Hexadecimal: " + hex);
    }
}