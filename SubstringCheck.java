 public class SubstringCheck {
    public static void main(String[] args) {
        String main = "HelloWorld";
        String sub = "World";

        if(main.contains(sub)) {
            System.out.println("Substring found");
        } else {
            System.out.println("Substring not found");
        }
    }
}