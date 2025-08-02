 public class AsciiPrinterjava1 {
    public static void main(String[] args) {
        String s = "Astha";
        for (char c : s.toCharArray()) {
            System.out.println(c + " = " + (int) c);
        }
    }
} 
