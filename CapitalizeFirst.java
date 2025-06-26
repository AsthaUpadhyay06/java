 public class CapitalizeFirst {
    public static void main(String[] args) {
        String sentence = "java is awesome";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : words) {
            String capitalized = word.substring(0,1).toUpperCase() + word.substring(1);
            result.append(capitalized).append(" ");
        }

        System.out.println("Capitalized: " + result.toString().trim());
    }
}