public class AllEvenDigitsjava {
    public static void main(String[] args) {
        int n = 2486;
        boolean allEven = true;
        while (n > 0) {
            if ((n % 10) % 2 != 0) {
                allEven = false;
                break;
            }
            n /= 10;
        }
        System.out.println(allEven ? "All digits even" : "Not all even");
    }
}