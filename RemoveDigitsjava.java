 public class RemoveDigitsjava {
    public static void main(String[] args) {
        String input = "A1s2t3h4a5";
        String result = input.replaceAll("\\d", "");
        System.out.println("Without digits: " + result);
    }
}
