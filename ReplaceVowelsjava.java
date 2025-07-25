 public class ReplaceVowelsjava {
    public static void main(String[] args) {
        String s = "Astha Java";
        s = s.replaceAll("(?i)[aeiou]", "*");
        System.out.println("Modified: " + s);
    }
} 