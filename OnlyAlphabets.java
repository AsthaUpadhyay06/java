public class OnlyAlphabets {
    public static void main(String[] args) {
        String str = "AsthaOnly";
        boolean isAlpha = str.matches("[a-zA-Z]+");
        System.out.println(isAlpha ? "Only alphabets" : "Contains other characters");
    }
}
