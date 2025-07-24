public class AsciiPrinterjava {
    public static void main(String[] args) {
        String str = "Java";
        for (char ch : str.toCharArray()) {
            System.out.println(ch + " : " + (int) ch);
        }
    }
} 