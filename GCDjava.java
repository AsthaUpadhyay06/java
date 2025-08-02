 public class GCDjava {
    public static void main(String[] args) {
        int a = 36, b = 60;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("HCF is: " + a);
    }
}
