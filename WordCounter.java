 public class WordCounter {
    public static void main(String[] args) {
        String str = "Java is super fun to learn!";
        String[] words = str.trim().split("\\s+");
        System.out.println("Total words: " + words.length);
    }
} 