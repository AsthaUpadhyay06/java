 public class PalindromeSentence {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw";
        String clean = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String rev = new StringBuilder(clean).reverse().toString();

        if (clean.equals(rev))
            System.out.println("Palindrome Sentence");
        else
            System.out.println("Not a Palindrome");
    }
} 