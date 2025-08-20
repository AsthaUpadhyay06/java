 public class ASCIIPrinter1 {
    public static void main(String[] args) {
        String text = "Astha";

        for (char ch : text.toCharArray()) {
            System.out.println(ch + " → " + (int) ch);
        }
    }
} 