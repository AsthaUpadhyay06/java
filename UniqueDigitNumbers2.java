public class UniqueDigitNumbers2 {
    public static void main(String[] args) {
        for (int i = 100; i <= 200; i++) {
            String s = String.valueOf(i);
            if (s.charAt(0) != s.charAt(1) && s.charAt(0) != s.charAt(2) && s.charAt(1) != s.charAt(2)) {
                System.out.print(i + " ");
            }
        }
    }
} 
