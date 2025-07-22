public class PalindromeWords {
    public static void main(String[] args) {
        String sentence = "madam and racecar are palindromes";
        for (String word : sentence.split(" ")) {
            String rev = new StringBuilder(word).reverse().toString();
            if (word.equals(rev))
                System.out.println(word + " is a palindrome");
        }
    }
}