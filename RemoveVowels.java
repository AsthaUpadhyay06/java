public class RemoveVowels {
    public static void main(String[] args) {
        String s = "Java Programming";
        s = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Without vowels: " + s);
    }
}