 public class ReplaceVowels {
    public static void main(String[] args) {
        String str = "Java is awesome";
        String replaced = str.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("After replacing vowels: " + replaced);
    }
} 