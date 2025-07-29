public class WordCountjava11 {
    public static void main(String[] args) {
        String str = "Java is a powerful language";
        String[] words = str.trim().split("\\s+");
        System.out.println("Total words: " + words.length);
    }
}