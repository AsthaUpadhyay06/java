public class WordsEndingWithVoweljava {
    public static void main(String[] args) {
        String str = "Astha is a Java enthusiast";
        String[] words = str.split(" ");
        int count = 0;
        for (String w : words) {
            if (w.matches("(?i).*[aeiou]$")) count++;
        }
        System.out.println("Words ending with vowel: " + count);
    }
}