 public class ReverseWords1 {
    public static void main(String[] args) {
        String sentence = "Java is super fun";
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        System.out.println("Reversed: " + reversed.toString().trim());
    }
} 