public class HideDigitsjava {
    public static void main(String[] args) {
        String s = "Hello123World99";
        String replaced = s.replaceAll("[0-9]", "*");
        System.out.println(replaced);
    }
}