public class LongestWordjava1 {
    public static void main(String[] args) {
        String sentence = "Coding in Java is super exciting";
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words)
            if (word.length() > longest.length())
                longest = word;
        System.out.println("Longest word: " + longest);
    }
}