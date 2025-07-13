public class WordCountjava {
    public static void main(String[] args) {
        String s = "Astha is learning Java daily";
        String[] words = s.trim().split("\\s+");
        System.out.println("Words: " + words.length);
    }
}