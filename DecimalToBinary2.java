 public class DecimalToBinary2{
    public static void main(String[] args) {
        int num = 10;
        String binary = "";

        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }

        System.out.println("Binary: " + binary);
    }
} 
