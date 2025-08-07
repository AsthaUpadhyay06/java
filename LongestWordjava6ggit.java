public class LongestWordjava6ggit {
    public static void main(String[] args) {
        String sentence = "Coding makes problem solving interesting";
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        System.out.println("Longest word: " + longest);
    }
} 