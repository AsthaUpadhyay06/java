
    public class RemoveDigits1 {
    public static void main(String[] args) {
        String str = "A1s2t3h4a5";
        String result = str.replaceAll("\\d", "");
        System.out.println("Without digits: " + result);
    }
}
   

